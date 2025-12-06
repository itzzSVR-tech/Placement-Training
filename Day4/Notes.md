# Recursion

`Recursion` is the technique of making a function call itself. This technique provides a way to break complicated problems down into simpler problems which are easier to solve.

### Recursion Example

`Adding two numbers` together is easy to do, but adding a `range of numbers` is more complicated. In the following example, recursion is used to add a range of numbers together by breaking it down into the simple task of adding two numbers:

```java
public class Main {
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
}
```

When the `sum()` method is called, it adds parameter `k` to the sum of all numbers smaller than `k` and returns the result. When `k` becomes 0, the method just returns 0.

### Working of Recursion

The idea is to `represent` a `problem` in terms of `one or more smaller sub-problems` and add `base conditions` that stop the recursion. For example, we compute factorial n if we know the factorial of (n-1). The base case for factorial would be n = 0. We return 1 when n = 0.

![Recursion](https://media.geeksforgeeks.org/wp-content/uploads/20230417232220/Recursion-in-Java-1-768.webp)

### Advantages of Recursion

- Recursion provides a clean and simple way to write code.
- Some problems are inherently recursive like tree traversals, Tower of Hanoi, etc. For such problems, it is preferred to write recursive code.

### Disadvantages of Recursion

- The recursive program has greater space requirements than the iterative program as all functions will remain in the stack until the base case is reached.
- It also has greater time requirements because of function calls and returns overhead.

# Classes and Objects

Classes and Objects form the foundation of Object-Oriented Programming (OOP). They help model real-world entities and organize code in a structured way.

A class is a blueprint used to create objects that share common properties and behavior.
An object is an instance of a class. It represents a specific entity created from the class template.

For Example, Dog is a class, Tommy is an object of that class.

![classesObjects](https://media.geeksforgeeks.org/wp-content/uploads/20250805190315437489/Class_Object_example.webp)

### Java Class

A class is a blueprint that defines data and behavior for objects. It groups related fields and methods in a single unit. Memory for its members is allocated only when an object is created.

- Acts as a template to create objects with shared structure.
- Does not occupy memory for fields until instantiation.
- Can contain fields, methods, constructors, nested classes and interfaces.

```java
class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return n; }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(10, "Alice");
        System.out.println(s1.getId());
        System.out.println(s1.getName());
    }
}
```

