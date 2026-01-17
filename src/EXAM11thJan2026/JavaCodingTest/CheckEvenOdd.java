package EXAM11thJan2026.JavaCodingTest;

//2) Even or Odd Number
//Description:
//Write a Java program to check whether a given number is even or odd using arithmetic operators.

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();

        // Check if the remainder is zero when divided by 2
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }

        scanner.close();
    }
}
