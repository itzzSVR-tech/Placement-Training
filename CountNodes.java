class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class CountNodes {
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

    public int getCount() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        // Create a new linked list
        CountNodes llist = new CountNodes();

        // Add elements to the linked list
        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(4);
        llist.add(5);

        // Count the number of nodes and print the result
        System.out.println("Number of nodes in the linked list: " + llist.getCount());

        // Test with an empty list
        CountNodes emptyList = new CountNodes();
        System.out.println("Number of nodes in an empty linked list: " + emptyList.getCount());
    }
}
