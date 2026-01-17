package EXAM11thJan2026.JavaCodingTest;
//12) Break Statement Example

//Description:
//Write a Java program to print numbers from 1 to 10, but stop the loop when the number becomes 5 using the break statement.

public class BreakExample {
    public static void main(String[] args) {
        System.out.println("Starting loop to print numbers 1 to 10...");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Reached 5. Executing 'break' to exit loop...");
                break; // Immediately terminates the loop
            }
            System.out.println("Number: " + i);
        }

        System.out.println("Loop terminated. Moving to the next line of code.");
    }
}
