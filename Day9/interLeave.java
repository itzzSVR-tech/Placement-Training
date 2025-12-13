package Day9;

import java.util.LinkedList;
import java.util.Queue;

public class interLeave {
    public static void interleaveQueue(Queue<Integer> q) {
        if (q.size() % 2 != 0) {
            System.out.println("Input queue size must be even.");
            return;
        }

        Queue<Integer> s = new LinkedList<>();
        int halfSize = q.size() / 2;

        for (int i = 0; i < halfSize; i++) {
            s.add(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);
        q.add(18);
        q.add(19);
        q.add(20);

        System.out.println("Original Queue: " + q);
        interleaveQueue(q);
        System.out.println("Interleaved Queue: " + q);

        Queue<Integer> q2 = new LinkedList<>();
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);

        System.out.println("Original Queue" + q2);
        interleaveQueue(q2);
        System.out.println("Interleaved Queue: " + q2);
    }
}