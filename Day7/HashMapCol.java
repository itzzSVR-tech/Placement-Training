package Day7;

import java.util.HashMap;

public class HashMapCol {
    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<>();
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

        hm1.put(1, "Only");
        hm1.put(2, "For");
        hm1.put(3, "You");

        hm2.put(1, "Only");
        hm2.put(2, "For");
        hm2.put(3, "You");

        System.out.println("Mappings of HashMap hm1 are: " + hm1);
        System.out.println("Mappings of HashMap hm2 are: " + hm2);
    }
}
