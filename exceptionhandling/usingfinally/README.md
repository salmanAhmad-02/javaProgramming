# Java Exceptions: The `finally` Block

## What Is `finally`?

The **`finally` block** is the part of a `try`/`catch` statement that **always runs**, whether or not an exception occurred, and whether or not it was caught. Its job is **cleanup**: releasing resources (files, connections, locks) that must be freed in every case, so they are never leaked.

```java
try {
    // risky code
} catch (SomeException e) {
    // runs only if SomeException is thrown
} finally {
    // runs in every case
}
```

---

## Package Structure

```
usingfinally/
├── Demo.java                 # Shows when finally runs (normal, caught, uncaught)
├── CloseResourse.java        # Closes a file Scanner in finally
├── data.txt                  # Input file read by CloseResourse
└── PreventingDeadlock.java   # Releases a ReentrantLock in finally
```

| File | Role | What `finally` does there |
|------|------|---------------------------|
| `Demo.java` | Divides 10 by a number | Prints a message to show it always runs |
| `CloseResourse.java` | Reads the first line of `data.txt` | Closes the `Scanner` |
| `data.txt` | One line of text | |
| `PreventingDeadlock.java` | Three threads update one shared counter | Releases the lock |

---

## Order of Execution

1. The `try` block runs.
2. If an exception occurs, the **first matching** `catch` block runs.
3. The `finally` block runs, whatever happened above.
4. Execution continues after the whole statement, or an uncaught exception continues upward.

---

## Example 1: When Does `finally` Run?

**Code:** `Demo.java`

```java
package usingfinally;

public class Demo {
    static void demo(int y) {
        try {
            System.out.println("try: start");
            int r = 10 / y;
            System.out.println("try: result " + r);
        } catch (ArithmeticException e) {
            System.out.println("catch: " + e.getMessage());
        } finally {
            System.out.println("finally: always runs");
        }
        System.out.println("after");
    }

    public static void main(String[] args) {
        demo(0);
    }
}
```

### Output (`demo(0)`)

```
try: start
catch: / by zero
finally: always runs
after
```

### What happened?

1. `try: start` is printed.
2. `10 / 0` throws an `ArithmeticException`, so the rest of the `try` block is skipped. `"try: result"` is never printed.
3. The `catch` block handles it.
4. `finally` runs.
5. The program continues, so `"after"` is printed.

### Try other scenarios

Change the call in `main` or the `catch` type and compare:

| Change | Output | Notes |
|--------|--------|-------|
| `demo(2)` | `try: start`, `try: result 5`, `finally: always runs`, `after` | No exception, and `finally` **still runs** |
| `demo(0)` (as written) | see above | Exception caught, `finally` runs |
| `demo(0)` with `catch (NullPointerException e)` instead | `try: start`, `finally: always runs`, then a crash with a stack trace | The exception is **not caught**, but `finally` runs **before** the crash. `"after"` is never printed |

So `finally` runs in all three situations: no exception, caught exception, and uncaught exception.

---

## Example 2: Closing a Resource

**Code:** `CloseResourse.java` and `data.txt`

```java
package usingfinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CloseResourse {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("D:\\javaProgramming\\exceptionhandling\\usingfinally\\data.txt"));   // may throw FileNotFoundException
            System.out.println(sc.nextLine());        // may throw NoSuchElementException
        } catch (FileNotFoundException e) {
            System.out.println("File missing");
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();                           // runs in every case
            }
        }
    }
}
```

`data.txt` contains one line:

```
Helllllllllllllllo Sir...
```

### Output

```
Helllllllllllllllo Sir...
```

### Why this design?

- **`sc` is declared outside the `try`**, otherwise the `finally` block could not see it.
- **The `null` check** is needed because if `new Scanner(...)` throws, `sc` was never assigned, and calling `close()` on `null` would cause a `NullPointerException`.
- **`close()` is in `finally`**, so the file is released whether the read succeeds, the file is missing, or the file is empty.

### Two exceptions, two different kinds

| | `FileNotFoundException` | `NoSuchElementException` |
|---|---|---|
| Kind | **Checked**: the compiler forces you to catch it | **Unchecked**: nothing forces you |
| Happens when | The file can't be found | `nextLine()` has no line to read (empty file) |
| Message printed here | `File missing` | The exception's own message |

The two types are unrelated, so the order of the `catch` blocks does not matter.

### Try other scenarios

| Scenario | Output |
|----------|--------|
| `data.txt` exists with text (as above) | The first line of the file |
| Path is wrong or the file doesn't exist | `File missing` |
| `data.txt` exists but is **empty** | The exception's message (with most JDKs this reads `No line found`), and the file is still closed by `finally` |

### The file path, and why "File missing" appeared

While building this example, a relative path (`new File("data.txt")`) printed `File missing` even though the file existed. Cause: **a relative path is resolved from the program's working directory** (often the project root in VS Code), **not from the folder of the `.java` file**. Java was looking in the wrong place, and the `catch` block correctly reported that.

Ways to fix it:

1. Move `data.txt` to the working directory.
2. Use a path relative to the working directory, for example `"usingfinally/data.txt"`.
3. Use an **absolute path** (as this code does), which works but breaks on other machines.

To see exactly where Java is looking:

```java
System.out.println(new File("data.txt").getAbsolutePath());
```

### A more helpful message

The `catch (FileNotFoundException e)` block prints only `"File missing"`, which hides **which** file and **why**. Printing the exception's message is more useful:

```java
System.out.println("File missing: " + e.getMessage());
```

### Alternatives

- **Prevent instead of catch:** an empty file is a normal situation you can check for. `if (sc.hasNextLine()) { ... }` avoids the `NoSuchElementException` altogether.
- **try-with-resources** closes the resource automatically, with no `finally` and no `null` check:
  ```java
  try (Scanner sc = new Scanner(new File("data.txt"))) {
      System.out.println(sc.nextLine());
  } catch (FileNotFoundException e) {
      System.out.println("File missing");
  }
  ```

---

## Example 3: Releasing a Lock

**Code:** `PreventingDeadlock.java`

```java
package usingfinally;

import java.util.concurrent.locks.ReentrantLock;

public class PreventingDeadlock {

    private final ReentrantLock lock = new ReentrantLock();
    private int count = 0;

    public void increment(int val) {
        for (int i = 1; i <= val; i++) {
            lock.lock();
            try {
                count++;
                System.out.println(Thread.currentThread().getName() + " Adde " + i + " Tokens. Current total :" + count);
            } finally {
                lock.unlock();
            }
        }
    }

    public void printData() {
        System.out.println("Final Updated Total Count Is " + count);
    }

    public static void main(String[] args) throws InterruptedException {

        PreventingDeadlock sharedResource = new PreventingDeadlock();

        Thread t1 = new Thread(() -> sharedResource.increment(500), "Buyer-1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                sharedResource.increment(1000);
            }
        }, "Buyer-2");
        Thread t3 = new Thread(() -> sharedResource.increment(100), "Buyer-3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        sharedResource.printData();
    }
}
```

### What it does

Three threads (`Buyer-1`, `Buyer-2`, `Buyer-3`) all increment the **same** counter: 500, 1000 and 100 times. A `ReentrantLock` ensures only one thread updates the counter at a time.

### Output

The order in which the thread names appear **varies from run to run**, but the structure is always like this (illustrative):

```
Buyer-1 Adde 1 Tokens. Current total :1
Buyer-1 Adde 2 Tokens. Current total :2
Buyer-2 Adde 1 Tokens. Current total :3
...
Final Updated Total Count Is 1600
```

- The **"Current total"** values always count up one by one (1, 2, 3 ... 1600), because the `println` is inside the locked section.
- The **final line is always** `Final Updated Total Count Is 1600` (500 + 1000 + 100).

### Why `finally` is essential here

A `ReentrantLock` is **never released automatically**. You must call `unlock()` yourself. If the `try` block threw an exception and `unlock()` were not in `finally`, the thread would die **still holding the lock**. Every other thread would wait forever at `lock.lock()`, and `join()` would hang. Putting `unlock()` in `finally` guarantees the release on both the normal path and the exception path.

### Why `lock.lock()` is outside the `try`

This is the standard idiom. If `lock()` were inside the `try` and failed, `finally` would call `unlock()` on a lock the thread **doesn't hold**, which throws `IllegalMonitorStateException` and hides the original problem. Acquire first, then start the protected block.

### Why a lock at all?

`count++` is not atomic (read, add, write). Without the lock, threads would overwrite each other's updates and the final total could be **lower than 1600**.

### Try it: see what `finally` protects

Add a deliberate failure inside the `try`:

```java
try {
    if (i == 3 && Thread.currentThread().getName().equals("Buyer-1")) {
        throw new RuntimeException("boom");
    }
    count++;
    ...
} finally {
    lock.unlock();
}
```

| Version | Result |
|---------|--------|
| With `finally` | `Buyer-1` stops with a stack trace, the lock is released, and `Buyer-2` and `Buyer-3` finish. The total is below 1600 because `Buyer-1` stopped early |
| `unlock()` placed after the `try`, without `finally` | `Buyer-1` dies holding the lock, the others block forever, and the program **never ends** |

---

## Good to Know (Concepts Beyond These Files)

- **`finally` runs even when `try` returns.** The return value is saved first, then `finally` runs, then the method returns.
- **Never `return` or `throw` from inside `finally`.** It silently replaces any exception that was in flight, hiding the real error.
- **`finally` does not run** if `System.exit()` is called in `try` or `catch`, or if the JVM crashes or the process is killed.

---

## Key Concepts Illustrated

| Concept | Where you see it |
|---------|------------------|
| `finally` runs with no exception | `Demo` with `demo(2)` |
| `finally` runs after a caught exception | `Demo` with `demo(0)` |
| `finally` runs even for an uncaught exception | `Demo` with a non-matching `catch` |
| Closing a resource in `finally` | `CloseResourse` |
| Declare the resource outside the `try` | `Scanner sc = null;` |
| Checked vs. unchecked exceptions | `FileNotFoundException` vs. `NoSuchElementException` |
| Releasing a lock in `finally` | `PreventingDeadlock` |
| Acquire the lock before the `try` | `lock.lock();` above `try` |

---

## Notes and Possible Improvements

- **`printData()` reads `count` without the lock.** This is safe here because `join()` guarantees all the threads have finished and their writes are visible. Reading it while the threads were still running would not be safe.
- **Locking once per iteration** lets the threads interleave. Locking once around the whole loop would let each thread finish its work in turn, which is simpler but less concurrent.
- **A simple counter doesn't need a lock.** `AtomicInteger.incrementAndGet()` does the same safely. The lock is the better teaching example because it protects any block of code.

---

## Thank You

