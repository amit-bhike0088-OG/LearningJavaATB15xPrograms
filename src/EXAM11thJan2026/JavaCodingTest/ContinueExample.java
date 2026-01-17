package EXAM11thJan2026.JavaCodingTest;
//13) Continue Statement Example
//Description:
//Write a Java program to print numbers from 1 to 10, but skip printing the number 5 using the continue statement.

public class ContinueExample {
    public static void main(String[] args) {
        System.out.println("Printing numbers 1 to 10 (skipping 5):");

        for (int i = 1; i <= 10; i++) {
            // Check if the number is 5
            if (i == 5) {
                // Skips the rest of the loop body for this iteration
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println("\nLoop finished.");
    }
}
