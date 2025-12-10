package Day6;

import java.util.LinkedList;

public class LinkedListCol {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Tesla");
        cars.add("Xiaomi SU7 Max");

        cars.addFirst("Mercedes");
        cars.addLast("Jaguar");

        System.out.println("LinkedList: " + cars);
    }
}
