package EXAM18thJan2026JavaCodingTest;

//Description:
//Write a Java program to reverse a given string using a loop.

public class ReverseString {
    public static void main(String[] args) {
        String input = "Automation";
        String reversed = "";

        // Loop starts from the last character (length - 1)
        // Continues as long as index is greater than or equal to 0
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
