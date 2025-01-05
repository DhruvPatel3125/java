// Write a Java program that prompts the user to input the base and height of a triangle.
// Accordingly calculates and displays the area of a triangle using the formula (base* height) / 2,
// and handles any input errors such as non-numeric inputs or negative values for base or height.
// Additionally, include error messages for invalid input and provide the user with the option to
// input another set of values or exit the program

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the base of the triangle: ");
            double base = getPositiveNumber(scanner);

            System.out.print("Enter the height of the triangle: ");
            double height = getPositiveNumber(scanner);

            double area = (base * height) / 2;
            System.out.printf("The area of the triangle is: %.2f%n", area);

            System.out.print("Would you like to calculate another triangle? (yes/no): ");
            String response = scanner.next().trim().toLowerCase();
            if (!response.equals("yes")) {
                System.out.println("Thank you! Goodbye!");
                break;
            }
        }

        scanner.close();
    }

    // Helper method to get a positive number
    private static double getPositiveNumber(Scanner scanner) {
        double number;
        while (true) {
            try {
                number = Double.parseDouble(scanner.next());
                if (number > 0) {
                    break;
                } else {
                    System.out.print("Please enter a positive number: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
        return number;
    }
}


