package EXAM11thJan2026.JavaCodingTest;
//3) Explicit Type Casting
//Description:
//Write a Java program to convert a double value into an int using explicit type casting and print both values.

public class TypeCastingExample {
    public static void main(String[] args) {
        // Step 1: Define a double value (larger data type)
        double originalDouble = 9.78;

        // Step 2: Manually cast double to int (narrowing)
        // This tells Java: "I know I am losing the decimal part, proceed anyway."
        int convertedInt = (int) originalDouble;

        // Step 3: Print both values to see the result
        System.out.println("Original Double value: " + originalDouble);
        System.out.println("Converted Integer value: " + convertedInt);
    }
}
