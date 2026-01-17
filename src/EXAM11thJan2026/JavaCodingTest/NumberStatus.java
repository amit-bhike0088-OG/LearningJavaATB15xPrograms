package EXAM11thJan2026.JavaCodingTest;
//5) Positive, Negative or Zero
//Description:
//Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.

import java.util.Scanner;

public class NumberStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Nested Ternary Operator
        // Logic: (Condition 1) ? "Result 1" : (Condition 2) ? "Result 2" : "Result 3"
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        System.out.println("The number is: " + result);

        scanner.close();
    }
}
