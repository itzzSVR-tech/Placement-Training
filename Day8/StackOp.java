package Day8;

import java.util.Stack;

public class StackOp {
    
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // 1. Push (Add)
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Stack: " + stack); // [Java, Python, C++]

        // 2. Peek (Look at top)
        System.out.println("Top element: " + stack.peek()); // C++

        // 3. Pop (Remove top)
        String removed = stack.pop();
        System.out.println("Popped: " + removed); // C++

        System.out.println("Stack after pop: " + stack); // [Java, Python]
    }
}
