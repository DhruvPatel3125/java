// public class p34 {
//     public static void main(String[] args) throws InterruptedException {
//         // Check if any command-line arguments are provided
//         if (args.length == 0) {
//             System.out.println("Please provide a string as a command-line argument.");
//         } else {
//             // Combine all command-line arguments into a single string and convert to uppercase
//             String input = String.join(" ", args).toUpperCase();
            
//             // Display each character with a 1-second delay
//             for (char ch : input.toCharArray()) {
//                 System.out.print(ch + " ");
//                 Thread.sleep(1000);  // Pause for 1 second (1000 milliseconds)
//             }
            
//             System.out.println();  // Move to the next line after displaying all characters
//         }
//     }
// }

// public class p34{
//     public static void main(String[] args) throws InterruptedException{
//         if(args.length == 0){
//             System.out.println("please enter the string");
//         }else{
//             String input = String.join(" ",args).toUpperCase();
//             for(char ch : input.toCharArray()){
//                 System.out.print(ch+" ");
//                 Thread.sleep(1000);
//             }
//             System.out.println();
//         }
//     }
// }

public class p34{
    public static void main(String[] args) throws InterruptedException{
        if(args.length == 0){
            System.out.println("please enter the string");
        }
        else{
            String input = String.join(" ",args).toUpperCase();
            for(char ch : input.toCharArray()){
                System.out.print(ch+" ");
                Thread.sleep(1000);
            }   

            System.out.println();
        }
    }
}