# Java Exceptions: Creating a Custom (Checked) Exception

## What Is a Custom Exception?

A **custom exception** is an exception class that **you write yourself** to represent an error specific to your program's rules. Java has no built-in "negative input" exception, so we create one.

Instead of waiting for Java to detect a problem (like dividing by zero), **your code detects the problem and throws the exception on purpose**, with a message that explains exactly what went wrong.

In this package the custom exception **extends `Exception`**, which makes it a **checked exception**: the compiler forces every caller to handle it.

---

## Package Structure

```
custom1/
├── NegativeInputException.java   # The custom (checked) exception
├── AddNumbers.java               # sum(): validates input and throws the exception
└── AddDriver.java                # Calls sum() and catches the exception
```

| File | Role |
|------|------|
| `NegativeInputException.java` | Defines the new exception type |
| `AddNumbers.java` | Business logic: adds two numbers, rejects negative input |
| `AddDriver.java` | Driver (`main`) that calls `sum()` and handles the failure |

---

## The Code

### 1. The custom exception

```java
package custom1;

public class NegativeInputException extends Exception {
    public NegativeInputException(String msg) {
        super(msg);
    }
}
```

- `extends Exception` makes it a **checked** exception.
- The constructor passes the message to the parent class with `super(msg)`. That is what makes `getMessage()` and the stack trace show your text.

### 2. The method that throws it

```java
package custom1;

public class AddNumbers {
    public static int sum(int x, int y) throws NegativeInputException {
        if (x < 0 || y < 0) {
            throw new NegativeInputException("Entered Negative Inputs");
        }
        return x + y;
    }
}
```

- The method checks the input **first**. If either number is negative, it throws.
- Otherwise it returns the sum.
- `throws NegativeInputException` in the signature warns every caller that this method can fail this way.

### 3. The driver that catches it

```java
package custom1;

public class AddDriver {
    public static void main(String[] args) {
        System.out.println("Main Start........");
        try {
            System.out.println(AddNumbers.sum(89, -98));
        } catch (NegativeInputException e) {
            // prints the exception and the call stack
            e.printStackTrace();
        }
        System.out.println("Main Ends...........");
    }
}
```

---

## Output

### Invalid input: `sum(89, -98)`

```
Main Start........
custom1.NegativeInputException: Entered Negative Inputs
	at custom1.AddNumbers.sum(AddNumbers.java:6)
	at custom1.AddDriver.main(AddDriver.java:7)
Main Ends...........
```

### Valid input: `sum(89, 98)`

```
Main Start........
187
Main Ends...........
```

### What happened in the invalid case?

1. `main` calls `sum(89, -98)`.
2. `-98 < 0`, so `sum` creates a `NegativeInputException` and **throws** it. The `return x + y` line is never reached.
3. Control jumps to the `catch` block in `main`. The `System.out.println(...)` around the call **never prints**, because it was waiting for a returned value.
4. `printStackTrace()` shows the exception type, the message, and the chain of calls that led to it. Read it top to bottom: the first `at` line is where it was **thrown**, the next is who **called** that.
5. The program continues and prints `"Main Ends..........."`, so it survived.

> **Note:** `printStackTrace()` writes to the **error stream** (`System.err`), while `println` writes to the normal stream. In some consoles the stack trace can appear out of order relative to the other lines. The line numbers in the trace depend on your exact file layout.

---

## `throw` vs `throws`

These two are easy to mix up:

| | `throw` | `throws` |
|---|---|---|
| What it is | A **statement** that throws one exception object | A **declaration** in the method signature |
| Where it appears | Inside the method body | After the parameter list |
| Example | `throw new NegativeInputException("...");` | `public static int sum(int x, int y) throws NegativeInputException` |
| Meaning | "An error happens **now**" | "This method **might** throw this" |

---

## Why the Compiler Forces You to Handle It

Because `NegativeInputException` extends `Exception` (and not `RuntimeException`), it is a **checked exception**. Every caller must do one of two things:

1. **Catch it** with `try`/`catch` (as `AddDriver` does), or
2. **Pass the responsibility up** by declaring `throws NegativeInputException` itself.

If `AddDriver` called `sum()` with neither, it would **not compile**.

| | Checked (`extends Exception`) | Unchecked (`extends RuntimeException`) |
|---|---|---|
| Examples | `NegativeInputException` (this package), `IOException` | `ArithmeticException`, `NullPointerException` |
| Compiler forces handling | Yes | No |
| `throws` clause needed | Yes | Optional |
| Typical meaning | "The caller can realistically recover, so think about it" | "Probably a programming mistake" |

---

## How This Improves on Earlier Approaches

In the `catching` package, `divide()` had to signal failure with a return value:

| Approach | Problem |
|----------|---------|
| Return `0` on failure | `0` is also a valid answer, so the failure is hidden |
| Return `null` on failure | Better, but the caller can forget to check, causing a `NullPointerException` later |
| **Throw a custom exception** | The method never returns a value on bad input, and the caller is **forced** to deal with it |

The exception also carries a message about **what** went wrong according to your own rules, which a built-in exception like `ArithmeticException: / by zero` can't do.

---

## Key Concepts Illustrated

| Concept | Where you see it |
|---------|------------------|
| Creating a custom exception | `NegativeInputException extends Exception` |
| Passing a message to the parent | `super(msg)` |
| Throwing an exception on purpose | `throw new NegativeInputException(...)` |
| Declaring what a method may throw | `throws NegativeInputException` |
| Checked exceptions must be handled | `try`/`catch` in `AddDriver` |
| Validate first, then compute | The `if` check comes before `return x + y` |
| Reading a stack trace | `e.printStackTrace()` |

---

## Notes and Possible Improvements

- **`printStackTrace()` is for developers.** It is great for learning, but real applications usually show `e.getMessage()` to the user or send the error to a logging framework.
- **The message could be more helpful.** Including the actual values, such as `"Negative input: x=89, y=-98"`, makes debugging easier.
- **A second constructor is common.** Adding `(String msg, Throwable cause)` lets you wrap an original exception, as in `new IllegalArgumentException("...", e)`.

---

## What's Next

- A custom **unchecked** exception that `extends RuntimeException`, and how the rules change
- Using custom exceptions to validate data in a class (constructor and setters)
- Exception chaining with a `cause`