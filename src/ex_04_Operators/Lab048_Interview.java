package ex_04_Operators;

public class Lab048_Interview {
    public static void main(String[] args) {
        int amit_salary = 12;
        boolean b = !(amit_salary > 10 || amit_salary < 5);
        System.out.println(b);
// Divide and Conquer!

        // A -> amit_salary > 10 -> 12 >10 ->  true
        // B -> amit_salary < 5 -> 12<5 -> false
        // (A || B) -> TRUE (true || false) -> true
        // !(true) -> False





    }
}