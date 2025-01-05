// 4. Create class EMPLLOYEE in java with id, name and salary as data members. Create 5 Different
// employee objects by taking input from user. Display all the information of an employee which is
// having maximum salary. 

import java.util.Scanner;

class EMPLOYEE {
    private int id;
    private String name;
    private double salary;

    // constructoeA
    public EMPLOYEE(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalaty() {
        return salary;
    }

    // display employee information

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name:" + name + ",Salary :" + salary);
    
    }

}

public class p3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        EMPLOYEE[] employees = new EMPLOYEE[5];

        //input employeee details
        for(int i = 0 ; i < 5;i++){
            System.out.println("Enter details for Employee"+ (i+1)+":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            employees[i] = new EMPLOYEE(id,name,salary);
        }

        //find employee with maximum salary

        EMPLOYEE maxsal = employees[0];
        for(EMPLOYEE emp : employees){
            if(emp.getSalaty()> maxsal.getSalaty()){
                maxsal = emp;
            }
        }

        //display employee with max salary
        System.out.println("\n Employee with maximum salary:");
        maxsal.displayInfo();

        scanner.close();
    }
    
}