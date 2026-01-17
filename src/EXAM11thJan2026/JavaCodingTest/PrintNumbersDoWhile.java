package EXAM11thJan2026.JavaCodingTest;
//9) Print Numbers Using do-while
//Description:
//Write a Java program to print numbers from 1 to 10 using a do-while loop.

public class PrintNumbersDoWhile {
    public static void main(String[] args) {
        int i = 1; // Initialization

        System.out.println("Printing numbers from 1 to 10:");

        do {
            System.out.print(i + " ");
            i++; // Increment
        } while (i <= 10); // Condition check at the end
    }
}
