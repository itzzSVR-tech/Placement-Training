package Day7;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeCol {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<String>();

        dq.add("For");
        dq.addFirst("Only");
        dq.addLast("You");

        System.out.println(dq);
        System.out.println(dq.pop());
        System.out.println(dq.poll());
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
    }
}
