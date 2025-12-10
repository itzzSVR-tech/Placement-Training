import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    Node head;
    Node temp;

    public void add(int data) {
        Node nn = new Node(data);

        if (head == null) {
            head = nn;
            temp = nn;
        } else {
            temp.next = nn;
            temp = nn;
        }
    }

    public void display() {
        temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL list = new LL();

        System.out.print("Enter an Integer: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.add(x);
        }
        list.display();
        sc.close();
    }
}
