package Day9;

import java.util.Scanner;

public class NaiveStackLL {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public NaiveStackLL() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }

        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! The stack is empty.");
            return -1;
        }

        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        Node current = top;
        System.out.print("Stack (Top -> Bottom): ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NaiveStackLL stack = new NaiveStackLL();

        System.out.print("Enter the no of elements: ");
        int noOfElem = sc.nextInt();

        for (int i = 0; i < noOfElem; i++) {
            System.out.print("Enter the " + i + " element: ");
            stack.push(sc.nextInt());
        }

        stack.display();

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped: " + stack.pop());

        stack.display();

        sc.close();
    }
}