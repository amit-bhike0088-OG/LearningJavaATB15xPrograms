package EXAM18thJan2026JavaCodingTest;

//Description:
//
//Write a Java program to compare two strings and check whether they are equal or not.

public class StringComparison {
    public static void main(String[] args) {
        String expectedValue = "Order Placed Successfully";
        String actualValue = "Order Placed Successfully";

        // Method 1: Content Comparison (The Standard for QA)
        if (expectedValue.equals(actualValue)) {
            System.out.println("Validation Passed: Strings are identical.");
        } else {
            System.out.println("Validation Failed: Strings do not match.");
        }

        // Method 2: Case-Insensitive Comparison
        String actualLower = "order placed successfully";
        if (expectedValue.equalsIgnoreCase(actualLower)) {
            System.out.println("Validation Passed: Matches regardless of case.");
        }
    }
}
