package EXAM18thJan2026JavaCodingTest;

//Description:
//Write a Java program to check whether the length of a given string is greater than 10 or not and print the result.


public class StringLengthCheck {
    public static void main(String[] args) {
        String input = "Automation Tester";

        // Logical check
        if (input.length() > 10) {
            System.out.println("The string length is greater than 10.");
            System.out.println("Actual Length: " + input.length());
        } else {
            System.out.println("The string length is 10 or less.");
            System.out.println("Actual Length: " + input.length());
        }
    }
}
