package Day6;

import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class CLL {
    Node head;
    Node prev;
    Node temp;

    public void add(int data) {
        Node nn = new Node(data);

        if (head == null) {
            head = nn;
            temp = nn;
        } else {
            temp.next = nn;
            temp = nn;
            nn.next = head;
        }
    }

    public void display() {
        temp = head.next;
        System.out.print(head.data);
        while (temp != head) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CLL list = new CLL();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.add(x);
        }
        list.display();
        sc.close();
    }
}
