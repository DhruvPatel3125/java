import java.util.Scanner;

// Custom exception class
class Flot extends Exception {
    public Flot(String s) {
        super(s);
    }
}

public class p44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String num = scanner.nextLine();

        try {
            // Check if the input contains a decimal point
            if (num.contains(".")) {
                throw new Flot("Floating-point numbers are not allowed. Please enter an integer number.");
            }

            // Try to parse the input as an integer
            int number = Integer.parseInt(num);
            System.out.println("The number is: " + number);

        } catch (Flot e) {
            System.out.println(e.getMessage()); // Print the custom exception message
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer number.");
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}