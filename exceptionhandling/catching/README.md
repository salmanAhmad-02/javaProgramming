# Java Exceptions: Catching Them

## What Is Exception Catching?

**Catching** an exception means intercepting it with a `try`/`catch` block **before it reaches the JVM**, so the program can respond to the error instead of terminating.

```java
try {
    // risky code that might throw
} catch (SomeException ex) {
    // runs only if SomeException is thrown inside try
}
// execution continues here
```

- **`try`** holds the code that might fail.
- **`catch`** names the exception type it can handle and contains the recovery code.
- If an exception occurs, the rest of the `try` block is **skipped** and control jumps to the matching `catch`.
- After the `catch` finishes, the program **continues normally**.

In the previous package (`exceptions`) every example crashed. In this package (`catching`) the same kinds of failures are **caught**, and the program survives.

---

## Package Structure

```
catching/
├── DivideExample.java         # divide(): catches ArithmeticException
├── DivideExampleDriver.java   # Runs divide() with a zero divisor
├── ArrayExample.java          # printElementsInRange(): catches NPE and AIOOBE
└── ArrayExampleDriver.java    # Runs printElementsInRange() with different inputs
```

| File | Role | Exceptions caught |
|------|------|-------------------|
| `DivideExample.java` | Logic class with `divide(dividend, divisor)` | `ArithmeticException` |
| `DivideExampleDriver.java` | Driver (`main`) for the division example | |
| `ArrayExample.java` | Logic class with `printElementsInRange(arr, start, end)` | `NullPointerException`, `ArrayIndexOutOfBoundsException` |
| `ArrayExampleDriver.java` | Driver (`main`) for the array example | |

---

## Example 1: Catching a Division Error

**Code:** `DivideExample.java` and `DivideExampleDriver.java`

The class contains two versions of `divide()`. Version 1 is commented out because it has a flaw. Version 2 is the active one.

### Version 1: Return `0` on failure (misleading, commented out)

```java
public static int divide(int dividend, int divisor) {
    int quotient = 0;                    // default value
    try {
        quotient = dividend / divisor;   // throws if divisor == 0
    } catch (ArithmeticException ex) {
        System.out.println(ex);          // quotient stays 0
    }
    return quotient;
}
```

The problem is that `0` is also a valid answer, so the caller can't tell a real result from a hidden failure:

| Call | Returns | Verdict |
|------|---------|---------|
| `divide(10, 20)` | `0` | Valid (0.5 truncated to 0) |
| `divide(10, 0)` | `0` | **Wrong.** The error is hidden as a valid-looking `0` |

### Version 2: Return `null` on failure (active)

```java
public static Integer divide(int dividend, int divisor) throws NullPointerException {
    try {
        return dividend / divisor;
    } catch (ArithmeticException ex) {
        System.out.println(ex);
        return null;
    }
}
```

The return type changed from `int` to `Integer`, because only an object type can be `null`. `null` can **never** be a real quotient, so a failure is now distinguishable from a result.

| Call | Returns | Verdict |
|------|---------|---------|
| `divide(10, 20)` | `0` | Valid (0.5 truncated) |
| `divide(10, 0)` | `null` | Failure |
| `int r = divide(10, 0);` | | `NullPointerException` (unboxing `null`) |

### The driver

```java
System.out.println(DivideExample.divide(10, 0));
```

### Output

```
Main Starts..........
java.lang.ArithmeticException: / by zero
null
Main Ends.............
```

- Line 2 is printed **inside** the `catch` block (`System.out.println(ex)`).
- Line 3 is printed by the **driver**: the returned `null`. `println` accepts an `Integer`, so printing `null` is safe.
- `"Main Ends"` **is printed**. Compare this with the `exceptions` package, where the program died at the failing call.

### Why "the caller must check"

`null` is only better than `0` if the caller actually checks for it:

```java
Integer r = DivideExample.divide(10, 0);
if (r != null) {
    System.out.println("Result: " + r);
} else {
    System.out.println("Division failed");
}
```

If the caller assigns the result to a primitive without checking, Java tries to **unbox** `null` and throws a `NullPointerException`:

```java
int r = DivideExample.divide(10, 0);   // NullPointerException
```

So the failure moved from "hidden" to "must be handled by the caller". That is an improvement, but not a perfect one.

### An error that try/catch cannot catch

```
Integer.MIN_VALUE / -1  ->  overflow, no exception, wrong result
```

The true answer doesn't fit in an `int`, so Java silently wraps around and returns `Integer.MIN_VALUE`. **No exception is thrown, so there is nothing to catch.** Catching only helps for errors Java actually reports. Checking input yourself (for example with `Math.divideExact`, which throws on overflow) is a different technique.

---

## Example 2: Catching Array Errors

**Code:** `ArrayExample.java` and `ArrayExampleDriver.java`

```java
public static void printElementsInRange(int[] arr, int start, int end) {
    try {
        for (int i = start; i < end; i++) {
            System.out.println(arr[i]);
        }
    } catch (NullPointerException ex) {
        System.out.println(ex);
    } catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println(ex);
    }
}
```

This `try` has **two `catch` blocks**. Java checks them from top to bottom and runs the **first one that matches** the exception type. At most one `catch` runs per exception.

### The driver

```java
int[] a = {76, 67, 45, 34};

ArrayExample.printElementsInRange(a, 0, 2);
// ArrayExample.printElementsInRange(a, -1, 4);
// ArrayExample.printElementsInRange(null, 0, 5);
```

### Output (valid range, no exception)

```
Main Starts ..........
76
67
Main Ends ..........
```

### Try the other scenarios

Uncomment one call at a time in `ArrayExampleDriver.java`:

| Call | Exception caught | Printed message |
|------|------------------|-----------------|
| `(a, 0, 2)` | none | `76` and `67` |
| `(a, -1, 4)` | `ArrayIndexOutOfBoundsException` | `...Index -1 out of bounds for length 4` (nothing printed first) |
| `(a, 0, 7)` | `ArrayIndexOutOfBoundsException` | `76`, `67`, `45`, `34`, then `...Index 4 out of bounds for length 4` |
| `(null, 0, 5)` | `NullPointerException` | A message saying the array is `null` (exact wording depends on your JDK version) |

In **every** case `"Main Ends .........."` is still printed, because the exception is caught inside the method and never reaches `main`.

Notice that with `(a, 0, 7)` the four valid elements are printed **before** the exception. The loop works normally until the first invalid index.

---

## Multiple `catch` Blocks vs Multi-catch

Java gives you two ways to handle more than one exception type from the same `try`. They look similar, but they are **different tools**.

### 1. Multiple `catch` blocks (separate blocks)

Each exception type gets **its own** `catch` block, and each block can respond differently. This is what `ArrayExample` uses.

```java
try {
    for (int i = start; i < end; i++) {
        System.out.println(arr[i]);
    }
} catch (NullPointerException ex) {
    System.out.println("Array is null: " + ex.getMessage());
} catch (ArrayIndexOutOfBoundsException ex) {
    System.out.println("Bad index: " + ex.getMessage());
}
```

- Java checks the blocks **from top to bottom** and runs the **first one that matches**.
- At most **one** `catch` block runs for a given exception.
- Use this when each exception needs a **different response**.

### 2. Multi-catch (one block, several types joined with `|`)

One `catch` block handles **several** exception types in the same way. Available since Java 7.

```java
try {
    for (int i = start; i < end; i++) {
        System.out.println(arr[i]);
    }
} catch (NullPointerException | ArrayIndexOutOfBoundsException ex) {
    System.out.println(ex);
}
```

- The `|` means "catch **either** of these types".
- Use this when the response is **identical** for all the listed types. It removes duplicated code.

### Side-by-side comparison

| | Multiple `catch` blocks | Multi-catch |
|---|---|---|
| Syntax | `catch (A ex) {...} catch (B ex) {...}` | `catch (A \| B ex) {...}` |
| Number of blocks | One per exception type | One for all listed types |
| Handling code | Can differ per type | Must be the same for all |
| Type of `ex` | Exactly that exception type | The **common parent** of the listed types |
| Best when | Each exception needs its own response | Responses are identical |

For the same input, both versions of `printElementsInRange` produce the **same output**. For example, `(a, 0, 7)` prints `76`, `67`, `45`, `34`, then the `ArrayIndexOutOfBoundsException` line. Multi-catch is a shorter way to write the same behavior when the handlers are identical.

### Rules to remember

**For multiple `catch` blocks: specific before general.** If the types are related (parent and child), the child must come first, otherwise the code does not compile:

```java
try {
    int x = 10 / 0;
} catch (Exception ex) {              // parent catches everything first
    System.out.println("General");
} catch (ArithmeticException ex) {    // COMPILE ERROR: already caught
    System.out.println("Specific");
}
```

Swap the two blocks and it compiles. In `ArrayExample` the two types are unrelated, so either order works.

**For multi-catch:**

- **No parent and child together.** `catch (Exception | ArithmeticException ex)` does not compile, because `ArithmeticException` is already a kind of `Exception`. Your pair (`NullPointerException` and `ArrayIndexOutOfBoundsException`) are unrelated siblings, so it is fine.
- **`ex` is implicitly `final`.** You cannot reassign it inside the block.
- **`ex` has the common parent type.** Here that is `RuntimeException`, so you can use methods that both share (such as `getMessage()`), but nothing specific to only one of them.

### Using both together

You can mix them: group types that share a response, and give others their own block.

```java
try {
    // risky code
} catch (NullPointerException | ArrayIndexOutOfBoundsException ex) {
    System.out.println("Input problem: " + ex);
} catch (ArithmeticException ex) {
    System.out.println("Math problem: " + ex);
}
```

---

## Key Concepts Illustrated

| Concept | Where you see it |
|---------|------------------|
| `try` / `catch` prevents a crash | Both examples |
| Code after the failing statement in `try` is skipped | Loop stops at the bad index |
| Code **after** the whole `try`/`catch` still runs | `"Main Ends"` always prints |
| Multiple `catch` blocks, first match wins | `ArrayExample` |
| Multi-catch (`A \| B`) merges identical handlers | Multiple `catch` vs Multi-catch section |
| Catching an error is not the same as handling it well | Version 1 vs Version 2 of `divide()` |
| Some bugs throw no exception at all | `MIN_VALUE / -1` overflow |

### Printing the exception object

`System.out.println(ex)` prints the exception's type and message, for example:

```
java.lang.ArithmeticException: / by zero
```

This is a quick way to see what went wrong, but it only writes to the console. Real applications usually log errors or report them to the caller.

---

## Notes and Possible Improvements

- **Same handling, two `catch` blocks:** both blocks in `ArrayExample` do the same thing, so they could be merged into one multi-catch. See [Multiple `catch` Blocks vs Multi-catch](#multiple-catch-blocks-vs-multi-catch) for the comparison and the ordering rules.
- **`throws NullPointerException` on `divide()`:** `NullPointerException` is an unchecked exception, so the compiler doesn't require this clause, and `divide()` never throws it itself. The NPE happens later, in the **caller**, if it unboxes `null`. The clause works as documentation only, and can be removed or replaced by a Javadoc note.
- **The caller can't tell that `printElementsInRange` failed:** the method catches the error, prints it, and returns normally. This is the same "hidden failure" idea as Version 1 of `divide()`, but there is no misleading return value.

---

## What's Next

- `finally`: code that runs whether or not an exception occurred
- `throw` and `throws`: signaling an error and passing it to the caller
- Custom exception classes
- Checked vs. unchecked exceptions
- Returning `Optional` instead of `null`