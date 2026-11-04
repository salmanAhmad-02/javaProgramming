# Java Exceptions: Demonstrating What Goes Wrong

## What Is an Exception?

An **exception** is an unwanted or unexpected event that occurs **during the execution of a program** (at runtime) and disrupts its normal flow of instructions.

In Java, an exception is an **object**. When something illegal happens (such as dividing by zero or accessing an invalid array index), the JVM creates an exception object containing the error type, a message, and the stack trace, and **throws** it. If nothing **catches** it, the program terminates abnormally and the remaining code is never executed.

---

This package shows, with small runnable examples, **what happens when a Java program hits an unhandled exception**. Each example is deliberately written to crash, so you can see the failure, read the stack trace, and understand why it happened.

> **Goal:** understand the problem first. Handling exceptions (`try`/`catch`/`finally`, `throws`) is the natural next step once you've seen the crash.

---

## Package Structure

```
exceptions/
├── ExceptionExample.java    # Divides two integers (can fail: divide by zero)
├── Test.java                # Runs ExceptionExample with a zero divisor
├── ExampleOnArray.java      # Prints array elements in a range (can fail: bad index / null)
└── TestArrayExample.java    # Runs ExampleOnArray with invalid input
```

| File | Role | Exception it demonstrates |
|------|------|---------------------------|
| `ExceptionExample.java` | Logic class with `devide(x, y)` | `ArithmeticException` |
| `Test.java` | Driver (`main`) for the division example | triggers the above |
| `ExampleOnArray.java` | Logic class with `printElementsInRange(arr, start, end)` | `ArrayIndexOutOfBoundsException`, `NullPointerException` |
| `TestArrayExample.java` | Driver (`main`) for the array example | triggers the above |

---


## Example 1: Division by Zero

**Code:** `ExceptionExample.java` and `Test.java`

```java
public static int devide(int x, int y) {
    int result = x / y;   // fails when y == 0
    return result;
}
```

```java
int qsnt = ExceptionExample.devide(700, 0);
```

### Output

```
Main Starts ..........
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exceptions.ExceptionExample.devide(ExceptionExample.java:4)
	at exceptions.Test.main(Test.java:8)
```

### What happened?

- Integer division by `0` is mathematically undefined, so the JVM throws an `ArithmeticException`.
- The exception is thrown inside `devide`, but nobody catches it. It travels back up to `main`, and then up to the JVM.
- The program **terminates abnormally**. `"Main Ends .........."` is **never printed**, because the lines after the failing call are never executed.

---

## Example 2: Array Problems

**Code:** `ExampleOnArray.java` and `TestArrayExample.java`

```java
public static void printElementsInRange(int[] arr, int start, int end) {
    for (int i = start; i < end; i++) {
        System.out.println(arr[i]);
    }
}
```

There are two bad inputs to try. Uncomment one at a time in `TestArrayExample.java`.

### Case A: Range goes past the end of the array

```java
int[] a = {76, 67, 45, 34};
ExampleOnArray.printElementsInRange(a, 0, 7);
```

The array has 4 elements (valid indexes `0` to `3`), but the loop runs to index `6`.

```
Main Starts ..........
76
67
45
34
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
	at exceptions.ExampleOnArray.printElementsInRange(ExampleOnArray.java:6)
	...
```

Notice that the first four values **are** printed before the crash. The exception only occurs at the first invalid index.

### Case B: Negative start index

```java
ExampleOnArray.printElementsInRange(a, -1, 7);
```

Java arrays start at index `0`, so `arr[-1]` fails immediately with an `ArrayIndexOutOfBoundsException` (`Index -1 out of bounds for length 4`).

### Case C: `null` instead of an array

```java
ExampleOnArray.printElementsInRange(null, 0, 6);
```

There is no array object at all, so the first `arr[i]` access throws a `NullPointerException`. The exact message depends on your JDK version.

---

## Key Concepts Illustrated

| Concept | Where you see it |
|---------|------------------|
| **An exception is an object** thrown by the JVM when something illegal happens | All examples |
| **Unhandled exceptions crash the program** | Code after the failure never runs |
| **Stack trace**: a map of where the error happened and how execution got there | Read it bottom-to-top to follow the call chain |
| **Unchecked (runtime) exceptions**: no `throws` or `try/catch` required by the compiler | `ArithmeticException`, `ArrayIndexOutOfBoundsException`, `NullPointerException` |

### How to read a stack trace

```
Exception in thread "main" java.lang.ArithmeticException: / by zero   <- type and message
	at exceptions.ExceptionExample.devide(ExceptionExample.java:4)      <- where it was thrown
	at exceptions.Test.main(Test.java:8)                                <- who called it
```

The first `at` line is the exact spot of the failure. The lines below it show the chain of calls that led there.

---

## Quick Reference: The Exceptions Used

| Exception | Cause | Example trigger |
|-----------|-------|-----------------|
| `ArithmeticException` | Illegal math operation | `700 / 0` |
| `ArrayIndexOutOfBoundsException` | Index less than 0 or at least the array length | `arr[4]` on a 4-element array |
| `NullPointerException` | Using a reference that points to nothing | `null[0]` |

---

## What's Next

The natural follow-up is to **handle** these problems so the program keeps running:

- `try` / `catch` blocks to recover from errors
- `finally` for cleanup code that must always run
- `throw` and `throws` to signal and propagate errors
- Custom exception classes
- Checked vs. unchecked exceptions

---

## Notes for Contributors

- Each driver class contains commented-out lines for alternate scenarios. Uncomment **one at a time** to observe each failure separately.