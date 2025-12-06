package Day4;

class Dog {
    String name;
    String breed;
    int age;

    void bark() {
        System.out.println(name + " says: Woof Woof!");
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed + ", Age: " + age);
    }
}

public class ClassMultiObj {
    public static void main(String[] args) {

        // --- Object 1 ---
        // Create the first object
        Dog dog1 = new Dog();
        // Set values for dog1
        dog1.name = "Buddy";
        dog1.breed = "Golden Retriever";
        dog1.age = 5;

        // --- Object 2 ---
        // Create the second object
        Dog dog2 = new Dog();
        // Set values for dog2 (completely separate from dog1)
        dog2.name = "Rocky";
        dog2.breed = "Bulldog";
        dog2.age = 3;

        // --- Output ---
        System.out.println("--- Dog 1 Details ---");
        dog1.displayInfo();
        dog1.bark();

        System.out.println("\n--- Dog 2 Details ---");
        dog2.displayInfo();
        dog2.bark();
    }
}
