public class Task26Dec2025 {

    public static void main(String[] args) {
        System.out.println("--- Question 1 ---");
        question1();

        System.out.println("\n--- Question 2 ---");
        question2();

        System.out.println("\n--- Question 3 ---");
        question3();
    }

    // Question 1:
    static void question1() {
        int a = 10;
        // Calculation: 10 + 11 + 12
        System.out.println("Result: " + (a++ + a++ + a++));
    }

    // Question 2:
    static void question2() {
        int a = 3;
        // Calculation: 3 * 5
        int b = a++ * ++a;
        System.out.println("Result: " + b);
    }

    // Question 3:
    static void question3() {
        int a = 5;
        // Calculation: 5 + 6
        System.out.println("Result: " + (a++ + a--));
    }
}