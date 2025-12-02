# python, java ,javascript ,typescript

 programmes and concepts begginer 





## **1️⃣ Question: What is `final` in Java?**

**Answer:**

* `final` is a **keyword** used to **restrict the usage** of variables, methods, or classes.
* Once declared as `final`, the value or behavior **cannot be changed**.

**Examples:**

**Final variable (constant):**

```java
final int x = 10;
x = 20; // Error: cannot assign a value to final variable
```

**Final method (cannot be overridden):**

```java
class Parent {
    final void show() {
        System.out.println("Final method");
    }
}

class Child extends Parent {
    void show() { // Error: cannot override final method
        System.out.println("Override attempt");
    }
}
```

**Final class (cannot be extended):**

```java
final class Vehicle { }

class Car extends Vehicle { } // Error: cannot inherit from final class
```

**Key points:**

* Used for constants, immutability, and preventing modification.

---

## **2️⃣ Question: What is `finally` in Java?**

**Answer:**

* `finally` is a **block** used with **try-catch** to execute code **always**, whether an exception occurs or not.
* Typically used for **resource cleanup** (closing files, connections).

**Example:**

```java
try {
    int data = 10 / 0; // will throw exception
} catch (ArithmeticException e) {
    System.out.println("Exception caught");
} finally {
    System.out.println("Finally block always executes");
}
```

**Output:**

```
Exception caught
Finally block always executes
```

**Key points:**

* Executes **always**, regardless of exception.
* Used for **cleanup after try-catch**.

---

## **3️⃣ Question: What is `finalize()` in Java?**

**Answer:**

* `finalize()` is a **method** called by the **garbage collector** before an object is destroyed.
* Used to perform **cleanup operations**.
* Deprecated in Java 9+; modern Java prefers **try-with-resources**.

**Example:**

```java
class Demo {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being garbage collected");
    }
}

public class TestFinalize {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj = null;
        System.gc(); // request garbage collection
        System.out.println("End of main method");
    }
}
```

**Output (may vary):**

```
End of main method
Object is being garbage collected
```

**Key points:**

* Called **once per object** before GC.
* Execution **not guaranteed** or immediate.
* Primarily for **cleanup**.

---

## **4️⃣ Question: Difference between `final`, `finally`, and `finalize()`?**

| Feature   | `final`                        | `finally`                      | `finalize()`                      |
| --------- | ------------------------------ | ------------------------------ | --------------------------------- |
| Type      | Keyword                        | Block                          | Method                            |
| Purpose   | Restrict variable/method/class | Always execute after try/catch | Cleanup before garbage collection |
| When runs | Compile-time                   | Runtime (after try/catch)      | Runtime (before object GC)        |
| Usage     | Variable, method, class        | Exception handling             | Override in a class               |

---

## **5️⃣ Question: What are similar confusable Java concepts?**

**Answer:** Some common pairs or sets of Java keywords/concepts often confused:

1. **`final` vs `finally` vs `finalize()`**
2. **`==` vs `.equals()`**
3. **`throw` vs `throws`**
4. **`abstract` vs `interface`**
5. **`static` vs `non-static`**
6. **`String` vs `StringBuilder` vs `StringBuffer`**
7. **`checked` vs `unchecked` exceptions**
8. **`this` vs `super`**
9. **`break` vs `continue`**

---

## **6️⃣ Question: Difference between `==` and `.equals()`?**

**Answer:**

* `==` → checks **reference equality** (memory address) for objects, value for primitives.
* `.equals()` → checks **content equality** of objects.

**Example:**

```java
String a = new String("Hi");
String b = new String("Hi");
System.out.println(a == b);      // false
System.out.println(a.equals(b)); // true
```

---

## **7️⃣ Question: Difference between `throw` and `throws`?**

**Answer:**

* `throw` → used **inside a method** to actually throw an exception.
* `throws` → used in method signature to **declare exceptions** the method might throw.

**Example:**

```java
void test() throws IOException { // declares
    throw new IOException();     // throws
}
```

---

## **8️⃣ Question: Difference between `abstract` class and `interface`?**

| Feature     | Abstract class               | Interface                                          |
| ----------- | ---------------------------- | -------------------------------------------------- |
| Methods     | Can have abstract + concrete | Only abstract (default/static allowed from Java 8) |
| Variables   | Instance variables allowed   | All variables are public static final              |
| Inheritance | Extend one class only        | Implement multiple interfaces                      |

---

## **9️⃣ Question: Difference between `String`, `StringBuilder`, `StringBuffer`?**

| Feature     | String         | StringBuilder | StringBuffer |
| ----------- | -------------- | ------------- | ------------ |
| Mutability  | Immutable      | Mutable       | Mutable      |
| Thread-safe | -              | No            | Yes          |
| Performance | Low for concat | High          | Moderate     |

---

## **10️⃣ Question: Difference between `this` and `super`?**

| Feature     | this                         | super                       |
| ----------- | ---------------------------- | --------------------------- |
| Refers to   | Current object instance      | Parent class instance       |
| Usage       | Access current class members | Access parent class members |
| Constructor | Call another constructor     | Call parent constructor     |

---

