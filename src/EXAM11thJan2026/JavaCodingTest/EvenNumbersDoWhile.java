package EXAM11thJan2026.JavaCodingTest;
//10) Print Even Numbers
//Description:
//Write a Java program to print all even numbers between 1 and 50 using a do-while loop.

public class EvenNumbersDoWhile {
    public static void main(String[] args) {
        int number = 1; // Start at 1

        System.out.println("Even numbers between 1 and 50:");

        do {
            // Check if the number is divisible by 2
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
            number++; // Move to the next number
        } while (number <= 50);
    }
}
