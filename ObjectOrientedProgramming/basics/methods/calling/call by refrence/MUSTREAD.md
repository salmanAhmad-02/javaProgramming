# MUST READ: Does Java Support Call by Reference?

## 1. The Question

**Does Java allow or follow Call by Reference?**

**Answer: No. Java is strictly Call by Value.**

Java does not support Call by Reference, whether we pass primitive variables or objects to a method.

## 2. What Is Call by Value?

In Call by Value, a **copy of the value** is passed to the method.

- For primitive data types, the actual value is copied.
- For objects, the value of the reference is copied.

This distinction is important when understanding Java's behavior.

## 3. What Happens When We Pass an Object?

Consider the following points:

- An object is created in memory.
- A reference variable holds a reference to that object.
- When the reference is passed to a method, Java copies the reference value.
- Both the original reference and the copied reference can refer to the same object.
- Changes to the object's fields can be visible outside the method.
- Reassigning the copied reference does not change the original reference.

**Important:** Modifying an object through a reference is not the same as modifying the original reference variable.

## 4. Why Does It Sometimes Look Like Call by Reference?

When an object is passed to a method, the method can modify that object's fields. This may look like Call by Reference, but it is not.

Java passes a **copy of the reference value**, not the original reference variable itself.

Therefore, the method can modify the shared object's state, but it cannot directly replace the caller's reference variable by reassigning its own parameter.

## 5. Key Difference

| Concept | Java Behavior |
|---|---|
| Primitive arguments | Value is copied |
| Object arguments | Reference value is copied |
| Modifying an object's fields | Can affect the original object |
| Reassigning a method parameter | Does not reassign the caller's variable |
| Java's argument-passing mechanism | Call by Value |

## 6. Final Conclusion

**Java always follows Call by Value.**

Even when passing objects, Java copies the reference value. It does not pass the original reference variable by reference.

Remember this statement:

> Java passes object references by value; it does not pass objects by reference.

