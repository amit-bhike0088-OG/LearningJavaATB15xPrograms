package EXAM11thJan2026.JavaCodingTest;
//11) Reverse a Number
//Description:
//Write a Java program to reverse a given number using a do-while loop.

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to reverse: ");
        int number = scanner.nextInt();
        int originalNumber = number; // Store for final output
        int reversed = 0;

        // Use do-while to handle the case even if the user enters 0
        do {
            int lastDigit = number % 10;      // Extract the last digit
            reversed = (reversed * 10) + lastDigit; // Shift and add
            number = number / 10;             // Remove the last digit
        } while (number != 0);

        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversed);

        scanner.close();
    }
}