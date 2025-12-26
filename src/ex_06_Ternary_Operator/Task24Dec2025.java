package ex_06_Ternary_Operator;

public class Task24Dec2025 {


    public static void main(String[] args) {

        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        // The Nested Ternary Operator
        int answer = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);

        System.out.println("MAX OUT OF THREE is: " + answer);
    }
}
