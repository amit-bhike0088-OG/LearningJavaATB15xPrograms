package EXAM18thJan2026JavaCodingTest;

//Description:
//Write a Java program to count the total number of characters in a given string (excluding spaces).

public class CharacterCounter {
    public static void main(String[] args) {
        String input = "Learning Automation is Fun";

        // Calling the method to get the count
        int count = countCharacters(input);

        System.out.println("Input String: " + input);
        System.out.println("Total characters (excluding spaces): " + count);
    }

    /**
     * Counts characters in a string while skipping spaces.
     * @param str The input string
     * @return The total count of non-space characters
     */
    public static int countCharacters(String str) {
        int count = 0;

        // Convert string to character array and iterate
        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                count++;
            }
        }
        return count;
    }
}
