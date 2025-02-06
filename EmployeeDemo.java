import java.util.Scanner;
class Employee{
    int id;
    String name;
    double salary;

    //constructor
    public Employee(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //method
    public void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}


public class EmployeeDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[5];

        //input
        for(int i=0;i<5;i++){
            System.out.println("Enter emplouee ID:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter employee name:");
            String name = sc.nextLine();
            System.out.println("Enter employee salary:");
            double salary = sc.nextDouble();
            emp[i] = new Employee (id,name,salary);
        }
        //finding employee with highest salary
        Employee maxSal = emp[0];
        for(int i=1;i<emp.length;i++){
            if(emp[i].salary>maxSal.salary){
                maxSal = emp[i];
            }
        }
        System.out.println("Employee with highest salary:");
        maxSal.display();}
}