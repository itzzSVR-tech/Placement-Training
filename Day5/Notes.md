# `this` Keyword

The *`this`* keyword in Java is a reference to the current object within a class. There are 5 use cases for the `this` keyword

- Differentiating `instance` variables and `local` variables **(Shadowing)**
- Invoking Current `class methods`
- Invoking Current `class constructors` **(Constructor Chaining)**
- Returning the Current `class instance`
- To Pass `current object` as an `argument`

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

*`Encapsulation`* in `OOP (Object-Oriented Programming)` is the practice of bundling data (attributes) and the methods that operate on that data into a single unit (a class) and restricting direct access to the internal components, often using `access modifiers/specifiers` like `private`.

![Encapsule](https://ik.imagekit.io/upgrad1/abroad-images/imageCompo/images/__visual_selection_2025_05_29T190900_778TUVXYM.png?pr-true)

Encapsulation
: Binding data members and data methods with private accessing elements where only authorized objects can be accesed