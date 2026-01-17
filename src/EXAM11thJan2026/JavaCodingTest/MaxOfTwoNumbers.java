package EXAM11thJan2026.JavaCodingTest;
//4) Maximum of Two Numbers
//Description:
//Write a Java program to find the maximum of two numbers using the ternary operator.

import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Ternary operator logic:
        // If num1 is greater than num2, assign num1 to 'max'. Otherwise, assign num2.
        int max = (num1 > num2) ? num1 : num2;

        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);

        scanner.close();
    }
}
