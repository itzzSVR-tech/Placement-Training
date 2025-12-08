# `OOPS` (Object Oriented Programming System)

There a 5 Pillars in OOPS

- `Classes and Objects`

- `Abstraction`: Hiding complex implementation details and showing only essential features (e.g., driving a car without knowing engine mechanics).

- `Encapsulation`: Bundling data (attributes) and methods (functions) that operate on the data within a single unit (class), controlling access to them (data hiding).

- `Inheritance`: Allowing new classes (child/derived) to acquire properties and behaviors from existing classes (parent/base), promoting code reuse.

- `Polymorphism`: The ability of an object or method to take on many forms (e.g., a single function name doing different things in different contexts). 

# `this` Keyword

The *`this`* keyword in Java is a reference to the current object within a class. There are 5 use cases for the `this` keyword:

- Differentiating `instance` variables and `local` variables **(Shadowing)**
- Invoking Current `class methods`
- Invoking Current `class constructors` **(Constructor Chaining)**
- Returning the Current `class instance`
- To Pass `current object` as an `argument`

![this](https://dotnettrickscloud.blob.core.windows.net/article/java/3720240903094845.webp)

### `Shadowing`

When a method or constructor parameter has the same name as a class's instance variable, `this` is used to explicitly refer to the instance variable, resolving ambiguity.

```java
class MyClass {
    int value;

    MyClass(int value) {
        this.value = value; 
        /*
        'this.value' refers to the instance variable
        'value' refers to the local parameter
        */
    }
}
```

### `Class Methods`

`this` can be used to call other methods of the current object

```java
class MyClass {
    void method1() {
            // ...
    }

    void method2() {
        this.method1(); 
        /* Calls method1 of the current object */
    }
}
```

### `Constuctor Chaining`

*`this()`* can be used inside a `constructor` to call `another constructor` within the same class. This is useful for `code reuse` and setting default values. The call to `*this()*` must be the first statement in the constructor.

```java
class MyClass {
    int x;
    String name;

    MyClass(int x) {
        this.x = x;
    }

    MyClass(int x, String name) {
        this(x); // Calls the single-parameter constructor
        this.name = name;
    }
}
```

### `Class Instances`

*`this`* can be returned from a method, which is commonly used in `method chaining` or `builder patterns`.

```java
class MyClass {
    int data;

    MyClass setData(int data) {
        this.data = data;
        return this; 
        // Returns the current object
    }

    void display() {
        System.out.println(data);
    }
}

// Usage:
// MyClass obj = new MyClass();
// obj.setData(10).display();
```

### `Current Object as Argument`

*`this`* can be passed as an `argument` to a method or `constructor` of another class when the current object itself needs to be referenced.

# Encapsulation

*`Encapsulation`* in `OOP (Object-Oriented Programming)` is the *practice of bundling data (attributes) and the methods that operate on that data into a single unit (a class)* and restricting direct access to the internal components, often using `access modifiers/specifiers` like `private`.

![Encapsule](https://ik.imagekit.io/upgrad1/abroad-images/imageCompo/images/__visual_selection_2025_05_29T190900_778TUVXYM.png?pr-true)

## How it works

`Encapsulation` works by controlling the *visibility* and *accessibility* of a class's members using `access modifiers`. 

- `Private`: Members declared as private are only accessible within the same class. This is used for sensitive data or internal logic that should not be exposed to the outside.

- `Protected`: Members are accessible within the class itself and by its subclasses (derived classes).

- `Public`: Members are accessible from anywhere in the program and form the external interface of the class. 

To allow controlled interaction with private data, **public getter and setter methods** are typically provided. These methods act as intermediaries, allowing external code to `retrieve (get`) or `modify (set)` the data safely. Crucially, setter methods can include `validation logic` to ensure that only valid data is assigned, thereby maintaining `data integrity`.

## Benefits

- *`Data Hiding/Security`*: Protects an object's internal state from unauthorized access or modification, reducing the risk of errors or misuse.

- *`Improved Maintainability`*: Changes to a class's internal implementation can be made without affecting the external code that uses the class, provided the public interface remains consistent.

- *`Modularity and Reusability`*: Encapsulated classes are self-contained units with clearly defined interfaces, making them easier to understand, test, and reuse in different parts of a program or across projects.

- *`Control and Flexibility`*: Provides fine-grained control over how data is accessed and modified, allowing for validation rules and read-only or write-only attributes.

# Inheritance

`Inheritance` is a core principle of `object-oriented programming (OOP)` that allows a **new class** to `inherit properties` (fields and methods) from an ****existing class**. This mechanism promotes code reusability, which saves development time and effort. 

## Types of Inheritance

Different programming languages support various types of inheritance: 

- `Single Inheritance`: A derived class inherits from only one base class. This is the simplest and most common type.

- `Multilevel Inheritance`: A chain of inheritance where a class is derived from another derived class (e.g., Class C inherits from B, which inherits from A).
- `Hierarchical Inheritance`: Multiple derived classes inherit from a single base class (e.g., both Class B and Class C inherit from Class A).

- `Multiple Inheritance`: A derived class inherits from more than one base class. This is supported in languages like Python and C++, but not in Java (which uses interfaces to achieve similar functionality).

- `Hybrid Inheritance`: A combination of two or more types of inheritance, such as combining hierarchical and multiple inheritance

### Java Single Inheritance

The `inheritance` in which there is only `one base class` and `one derived class` is known as single inheritance. The single (or, single-level) inheritance inherits data from only one base class to only one derived class.

```java
class One {
  public void printOne() {
    System.out.println("printOne() method of One class.");
  }
}

public class Main extends One {
  public static void main(String args[]) {
    // Creating object of the derived class (Main)
    Main obj = new Main();

    // Calling method
    obj.printOne();
  }
}
```

### Java MultiLevel Inheritance

The `inheritance` in which a `base class` is `inherited` to a `derived class` and that `derived class` is further `inherited` to `another derived class` is known as multi-level inheritance. Multilevel inheritance involves multiple base classes.

```java
lass One {
  public void printOne() {
    System.out.println("printOne() method of One class.");
  }
}

class Two extends One {
  public void printTwo() {
    System.out.println("printTwo() method of Two class.");
  }
}

public class Main extends Two {
  public static void main(String args[]) {
    // Creating object of the derived class (Main)
    Main obj = new Main();

    // Calling methods
    obj.printOne();
    obj.printTwo();
  }
}
```

### Java Hierarchical Inheritance

The `inheritance` in which only `one base class` and `multiple derived classes` is known as hierarchical inheritance.

```java
// Base class
class One {
  public void printOne() {
    System.out.println("printOne() Method of Class One");
  }
}

// Derived class 1
class Two extends One {
  public void printTwo() {
    System.out.println("Two() Method of Class Two");
  }
}

// Derived class 2
class Three extends One {
  public void printThree() {
    System.out.println("printThree() Method of Class Three");
  }
}

// Testing CLass
public class Main {
  public static void main(String args[]) {
    Two obj1 = new Two();
    Three obj2 = new Three();

    //All classes can access the method of class One
    obj1.printOne();
    obj2.printOne();
  }
}
```

### Hybrid Inheritance



# Polymorphism

`Polymorphism` in `OOP (Object-Oriented Programming)` means **"many forms,"** allowing a `single interface or action` to behave differently across various objects, enabling code flexibility and reusability by treating different types of objects the same way through a common reference. It's implemented through concepts like *`method overloading`* (same name, different parameters, compile-time) and *`method overriding`* (same signature in derived classes, runtime), letting objects of related classes (like Dog and Cat from Animal) perform a shared action (like makeSound()) in their own specific ways

- *`One Interface, Many Forms`*: A single function or object can represent multiple behaviors or types, much like a single remote control can operate different devices (TV, DVD player) differently.

- *`Real-World Analogy`*: A person can play multiple roles (mother, employee, friend) depending on the situation, or an actor can play different characters (scientist, police officer, chef). 

### Types of Polymorphism

- `Compile-Time Polymorphism (Static)`: Resolved by the compiler before the program runs.
    
    - *Method Overloading*: Defining multiple methods in the same class with the same name but different parameter lists (number, type, or order).

- `Run-Time Polymorphism (Dynamic)`: Decided during execution, often using inheritance.

    - *Method Overriding*: A subclass provides a specific implementation for a method that is already defined in its superclass, accessed through a superclass reference. 

