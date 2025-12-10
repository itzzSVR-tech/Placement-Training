package Day7;

import java.util.*;

public class HashSetCol {
    public static void main(String[] args) {
        HashSet<String> al = new HashSet<>();
        al.add("A");
        al.add("B");
        al.add("C");

        Iterator<String> it = al.iterator();

        while (it.hasNext()) {
            String n = it.next();
            System.out.println(n);
        }

    }
}
