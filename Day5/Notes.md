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