import java.util.Scanner;

class Employee {
    private double salary;
    private String name;

    public Employee(String name, double salary) {
        this.name = name;
        setSalary(salary);
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
            System.out.println(name + "'s salary updated to: " + newSalary);
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    public String getName() {
        return name;
    }
}

public class CompanyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(empName, salary);

        double currentSalary = emp.getSalary();
        System.out.println(emp.getName() + " current salary is: " + currentSalary);

        System.out.println("\nAttempting to modify the salary:");

        emp.setSalary(750000);

        emp.setSalary(-500000);
        sc.close();
    }
}
