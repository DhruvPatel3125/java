// public class WhileLoop {
//     public static void main(String[] args) {
//         int counter = 1;
//         do {
//             System.out.println(counter +" namaste java");
//             counter++;
//     }while (counter <= 100);
//     System.out.println("print hw 1");
// }
// }


import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int sum = 0;
        int i =1;
        while (i<=range) {
           sum += i;
           i++;
        }
        System.out.println("Sum is: "+sum);
        
            }
        }