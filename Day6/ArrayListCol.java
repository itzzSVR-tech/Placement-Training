package Day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCol {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Charlie");
        names.add("Jag");
        names.add("Tammy");
        names.add("Rohan");
        names.add("Nandu");
        names.add("Mohini");

        System.err.println("X======Happy New Year======X");

        System.out.println("Main Characters: \n");
        for (String name : names) {
            System.out.println(name);
        }

        Collections.sort(names);
        System.out.println("\nSorted List: " + names);
    }
}
