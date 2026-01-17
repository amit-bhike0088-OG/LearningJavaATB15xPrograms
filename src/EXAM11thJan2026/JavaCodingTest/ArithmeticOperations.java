package EXAM11thJan2026.JavaCodingTest;
//1) Arithmetic Operations on Two Numbers
//
//Description:
//Write a Java program that takes two integer numbers
// and prints their sum, difference, multiplication, division, and remainder.
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Performing Operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        // Handle division by zero to prevent runtime exceptions
        if (num2 != 0) {
            int quotient = num1 / num2;
            int remainder = num1 % num2;

            System.out.println("\n--- Results ---");
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Multiplication: " + product);
            System.out.println("Division: " + quotient);
            System.out.println("Remainder (Modulo): " + remainder);
        } else {
            System.out.println("\n--- Results ---");
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Multiplication: " + product);
            System.out.println("Error: Cannot perform division or find remainder when divisor is zero.");
        }

        scanner.close();
    }
}