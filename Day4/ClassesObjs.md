# Classes and Objects

Classes and Objects form the foundation of Object-Oriented Programming (OOP). They help model real-world entities and organize code in a structured way.

A class is a blueprint used to create objects that share common properties and behavior.
An object is an instance of a class. It represents a specific entity created from the class template.

For Example, Dog is a class, Tommy is an object of that class.

![classesObjects](https://media.geeksforgeeks.org/wp-content/uploads/20250805190315437489/Class_Object_example.webp)

## Java Class

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

### Constructor

A `Constructor` is a method inside the class containing the same name as the `class`. It is a method which works without a return type. It's primary `purpose` is to **`Initialize the object`**

Key Characteristics:
1. **Name**: It must have the same name as the class.

2. **No Return Type**: It does not have a return type, not even void.

3. **Automatic Call**: It is called automatically when you create an object using the new keyword.

4. **Initialization**: It is typically used to give initial values to the instance variables defined in the class.

| Feature     | Constructor                | Method                             |
| :-------:   | :---------:                | :-----:                            |
| Purpose     | Initialize an object.      | Execute specific logic/behavior.   |
| Name        | Must match the Class name. | Can be any valid name.             |
| Return Type | None (not even void).      | Must have a return type (or void). |
| Invocation  | Implicitly called by new.  | Explicitly called by code.         |

#### Types of Constructor

##### Default Constructor

If you do not create any constructor in your class, the Java compiler automatically inserts one for you. This is known as the "Default Constructor."

- It takes no arguments.

- It initializes instance variables to their default values (e.g., 0 for integers, null for Strings).

`Note:` If you define any constructor manually, the compiler will stop creating the default constructor.

##### No Argument Constructor

This is a constructor that you write `explicity`, but it accepts no parameters.

```java
class Car {
    String brand;

    // No-Argument Constructor
    Car() {
        brand = "Unknown";
        System.out.println("Car created!");
    }
}
```

##### Parameterized Constructor

This constructor accepts specific `parameters` to initialize the object with distinct values.

```java
class Car {
    String brand;
    int year;

    // Parameterized Constructor
    Car(String b, int y) {
        this.brand = b;
        this.year = y;
    }
}
```