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