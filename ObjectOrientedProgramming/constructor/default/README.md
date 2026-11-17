# Default Constructor in Java

## What is it?

If you don't write any constructor in a class, the Java compiler automatically adds a **default constructor** for you. It takes no parameters.

## Example

```java
public class Car {
    String name;

    public String getDetais() {
        return name;
    }
}
```

We did not write any constructor here, yet we can do `new Car()`.

## Proof: Bytecode (`javap -c Car`)

```
Compiled from "Car.java"
public class Car {
  java.lang.String name;

  public Car();
    Code:
         0: aload_0
         1: invokespecial #1   // Method java/lang/Object."<init>":()V
         4: return

  public java.lang.String getDetais();
    Code:
         0: aload_0
         1: getfield      #7   // Field name:Ljava/lang/String;
         4: areturn
}
```

The `public Car();` entry was **not in our source code**. The compiler generated it.


So the default constructor is equivalent to:

```java
public Car() {
    super();
}
```

## Key Points

- Added **only if** no constructor is defined in the class.
- It has the **same access modifier as the class** (here, `public class Car` gives `public Car()`).
- It takes **no arguments**.
- It calls `super()`, the parent class's no-arg constructor.
- Fields are given default values (`name` is `null` here).
- Once you write **any** constructor yourself, the compiler will **not** add a default one.