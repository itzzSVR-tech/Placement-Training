# Functions

`Definition`: A block of code used to perform a specific function.

There are 3 parts to a Function:
1. Declaration
2. Definition
3. Call

```java
int add (int a, int b) {
    int s = a+b;
    return s;
}
add()
```
Here, 
- `int add()` is the `function declaration`
- `{....}` is the `function definition`
- `add()` is the `function call`

### Types of Functions

We can name 4 types of functions based on its params and return type:

1. with `@param` and with `return type`
2. with `@param` and without `return type`
3. without `@param` and with `return type`
4. without `@param` and without `return type`

# 2D Arrays

A 2D array is a data structure that stores elements in a `Grid` of _**Rows**_ and _**Columns**_

Effectively: It is an `array` of `arrays`

- `Structure`: A 2D array arranges data in a grid-like format with rows and columns.
- `Access`: To access a specific element, you need two indices: _`arrayName[rowIndex][columnIndex]`_.
- `Implementation`: It can be viewed as a list of one-dimensional arrays, where each inner array represents a row.
- `Purpose`: It provides a structured way to handle tabular or matrix-like data, which is more efficient than using multiple separate 1D arrays for related data sets. 