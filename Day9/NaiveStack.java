package Day9;

import java.util.Scanner;

public class NaiveStack {
    int[] arr;
    int top;
    int capacity;

    public NaiveStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Helper Methods
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    // Stack Methods
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow! (Can is full)");
            return;
        }
        top++;
        arr[top] = x;
        System.out.println("Pushed: " + x);
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("\nStack Underflow! (Can is empty)");
        } else {
            System.out.println("\nPopped: " + arr[top]);
            --top;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NaiveStack stack = new NaiveStack(5);

        System.out.print("Enter the no of elements: ");
        int noOfElem = sc.nextInt();

        for (int i = 0; i < noOfElem; i++) {
            System.out.print("Enter the " + i + " element: ");
            stack.push(sc.nextInt());
        }

        stack.pop();
        System.out.println("\nTop element: " + stack.peek());

        sc.close();
    }
}