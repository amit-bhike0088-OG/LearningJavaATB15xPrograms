package Task;

public class Task30Dec2025 {

    // Grade Calculator:
    //Write a program that calculates and displays the letter grade for a given numerical score
    // (e.g., A, B, C, D, or F) based on the following grading scale:
    //A: 90-100
    //B: 80-89
    //C: 70-79
    //D: 60-69
    //F: 0-59


    public static void main(String[] args) {
int score = 85;
        String grade;

        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else if (score >= 60 && score < 70) {
            grade = "D";
        } else if (score >= 0 && score < 60) {
            grade = "F";
        } else {
            grade = "Invalid Grade";
        }

        System.out.println("Your grade is: " + grade);
    }
}