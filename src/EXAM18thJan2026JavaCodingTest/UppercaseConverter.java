package EXAM18thJan2026JavaCodingTest;

//Description:
//Write a Java program to convert a given string into uppercase and print the result.

public class UppercaseConverter {
    public static void main(String[] args) {
        String input = "automation tester amit bhike";

        // Converting the string to uppercase
        String upperCaseResult = input.toUpperCase();

        System.out.println("Original String: " + input);
        System.out.println("Uppercase Result: " + upperCaseResult);
    }
}
