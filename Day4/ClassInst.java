

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class ClassInst {
    public static void main(String[] args) {
        Student s1 = new Student(10, "Alice");
        System.out.println(s1.getId());
        System.out.println(s1.getName());
    }
}
