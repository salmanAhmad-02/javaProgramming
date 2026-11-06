# Java Exceptions: Custom Unchecked Exceptions and Validated Objects

## What Is a Custom Unchecked Exception?

A **custom unchecked exception** is an exception class you write yourself that **extends `RuntimeException`**. Like any custom exception, it represents an error specific to your program's rules. Because it is *unchecked*, the compiler does **not** force callers to catch it or declare it with `throws`.

In the previous package (`custom1`) the custom exception extended `Exception` (checked). Here the exceptions extend `RuntimeException`, and they are used to protect a class from ever holding **invalid data**.

---

## Package Structure

```
custom2/
├── IllegalAgeException.java       # Custom unchecked exception for a bad age
├── ObjectNotFoundException.java   # Custom unchecked exception for a missing object
├── User.java                      # Class that validates its own data
└── UserDriver.java                # Driver that triggers and catches the failures
```

| File | Role |
|------|------|
| `IllegalAgeException.java` | Thrown when an age is outside the allowed range |
| `ObjectNotFoundException.java` | Thrown when a requested object does not exist |
| `User.java` | Holds a name and age, and refuses invalid values |
| `UserDriver.java` | Driver (`main`) that creates a user and handles the failures |

---

## The Code

### 1. The custom exceptions

```java
package custom2;

public class IllegalAgeException extends RuntimeException {
    public IllegalAgeException(String msg) {
        super(msg);
    }
}
```

```java
package custom2;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}
```

- Both extend `RuntimeException`, so both are **unchecked**.
- Each constructor passes the message to the parent class with `super(msg)`, so `getMessage()` returns it.
- No `throws` clause is ever needed for these.

### 2. The `User` class

```java
package custom2;

public final class User {
    private String name;
    private int age;

    public User(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be null or blank");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalAgeException("Age must be between 0 and 150, but was " + age);
        }
        this.age = age;
    }

    public String getDetails() {
        return name + "\t" + age;
    }
}
```

### 3. The driver

```java
package custom2;

public class UserDriver {
    public static void main(String[] args) {

        User u101 = null;
        try {
            u101 = new User("     ", 20);
        } catch (IllegalAgeException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            if (u101 == null) {
                throw new ObjectNotFoundException("User Not Found");
            }
            System.out.println();
        } catch (ObjectNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Main Thread Ends....");
    }
}
```

---

## Output

```
Name must not be null or blank
User Not Found
Main Thread Ends....
```

### What happened?

1. `new User("     ", 20)` calls the constructor, which calls `setName("     ")`.
2. The name is blank, so `setName` throws an `IllegalArgumentException`. The constructor stops, so **no `User` object is ever created** and `u101` stays `null`.
3. The first `catch` (`IllegalAgeException`) doesn't match. The second (`IllegalArgumentException`) does, so it prints the message.
4. In the next block `u101 == null`, so the code throws an `ObjectNotFoundException`, which is caught right below and prints `"User Not Found"`.
5. Neither exception was fatal, so `"Main Thread Ends...."` is printed.

### Try other inputs

Change the constructor call in `UserDriver` and compare:

| Call | What is printed | Why |
|------|-----------------|-----|
| `new User("Salman", 20)` | an empty line, then `Main Thread Ends....` | Valid user, so no exception. `u101` is not null, so the second block just runs `println()` |
| `new User("Salman", 200)` | `Age must be between 0 and 150, but was 200`, then `User Not Found` | `setAge` throws `IllegalAgeException` |
| `new User(null, 20)` | `Name must not be null or blank`, then `User Not Found` | `null` is rejected the same way as blank |
| `new User("  ", 200)` | `Name must not be null or blank`, then `User Not Found` | Only the **first** bad field is reported, because `setName` throws before `setAge` runs |

---

## Design Points Illustrated

### 1. Validate in the setters, and let the constructor call them

The rules for each field exist in **exactly one place**. If the constructor repeated the checks, a rule change (such as the maximum age) would have to be made twice, and one copy could be forgotten. It also means a setter can never become a back door for invalid data:

```java
User u = new User("Salman", 30);   // validated
u.setAge(-5);                      // also validated, throws
```

### 2. Validate first, assign last

In each setter the `if` check comes **before** `this.age = age`. If the check fails, the old value is untouched, so a failed update never leaves the object half-changed:

```java
User u = new User("Salman", 30);
try {
    u.setAge(200);                 // throws, assignment never happens
} catch (IllegalAgeException e) {
    System.out.println(e.getMessage());
}
System.out.println(u.getDetails()); // still: Salman	30
```

### 3. Invalid objects can't exist

If the constructor throws, the object is never created. You never end up holding a `User` with a blank name or an impossible age.

### 4. The class is `final`

The constructor calls `setName()` and `setAge()`. If someone could subclass `User` and override a setter, their code would run in the middle of building your object, which is a source of subtle bugs. `final` on the **class** prevents subclassing. It does **not** stop the setters from working: names and ages can still be changed through `setName()` and `setAge()`.

### 5. Messages state the rule and the bad value

Compare `"Invalid Age"` with `"Age must be between 0 and 150, but was 200"`. The second tells a developer exactly what rule was broken and what value caused it.

---

## Checked vs. Unchecked: `custom1` and `custom2`

| | `custom1`: `NegativeInputException` | `custom2`: `IllegalAgeException`, `ObjectNotFoundException` |
|---|---|---|
| Extends | `Exception` | `RuntimeException` |
| Kind | Checked | Unchecked |
| `throws` on the method | Required | Not needed |
| Caller must `try`/`catch` | Yes, compile error otherwise | No |
| If nobody catches it | Not possible, code won't compile | Program terminates with a stack trace |

Bad data passed by a caller is usually a mistake the caller should fix, not something to recover from at every call site. Forcing a `try`/`catch` around every `new User(...)` and `setAge(...)` would add noise, so unchecked fits well here. Java itself uses unchecked `IllegalArgumentException` for the same kind of problem. This is a design choice, not a hard rule.

### Multiple `catch` blocks and their order

The driver has two `catch` blocks for `IllegalAgeException` and `IllegalArgumentException`. Both extend `RuntimeException` and neither is a parent of the other, so their order doesn't matter. If one were a parent of the other, the more specific one would have to come first, or the code would not compile.

---

## Key Concepts Illustrated

| Concept | Where you see it |
|---------|------------------|
| Custom unchecked exception | `extends RuntimeException` |
| No `throws` needed | `setAge()` and the constructor have no `throws` clause |
| Validation in setters | `setName()`, `setAge()` |
| Constructor reuses setters | `User(String, int)` |
| Validate first, assign last | Check before `this.age = age` |
| A failed constructor means no object | `u101` stays `null` |
| Multiple `catch` blocks | `UserDriver` |
| Exceptions in a sequence of `try` blocks | The program continues after each caught exception |

---

## Notes and Possible Improvements

- **`IllegalAgeException` could extend `IllegalArgumentException`.** It would still be unchecked, an illegal age *is* an illegal argument, and one `catch (IllegalArgumentException e)` could then handle both name and age problems.
- **Store a date of birth instead of an age.** An age goes stale as time passes. A fixed `age` field is fine for a learning example.
- **Getters are minimal.** Only `getDetails()` exists. Add `getName()` and `getAge()` only if something needs them.

---

## What's Next

- `finally`: code that runs whether or not an exception occurred.