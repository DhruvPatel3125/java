import java.util.Scanner;
public class function {
    public static void printHello(){
        System.out.println("Hello World");
    }
    public static void calSum(int a,int b){
        int sum = a+b;
        System.out.println("Sum is: "+sum);      
        printHello();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        calSum(12,15);
    }
}
