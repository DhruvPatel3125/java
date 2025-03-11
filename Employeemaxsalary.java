import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee id: " + id);
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
    }
}

public class Employeemaxsalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int num = sc.nextInt();

        Employee[] emp = new Employee[num];
        Employee maxsal = null;

        for (int i = 0; i < num; i++) {
            System.out.println("Enter the details for Employee " + (i + 1) + ":");
            System.out.println("Enter the id:");
            int id = sc.nextInt();
            sc.nextLine();  // Consume newline
            System.out.println("Enter the name:");
            String name = sc.nextLine();
            System.out.println("Enter the salary:");
            double salary = sc.nextDouble();
            emp[i] = new Employee(id, name, salary);
            if (maxsal == null || salary > maxsal.salary) {
                maxsal = emp[i];
            }
        }

        System.out.println("Employee with maximum salary:");
        maxsal.display();
        sc.close();
    }
}
