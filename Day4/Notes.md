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

