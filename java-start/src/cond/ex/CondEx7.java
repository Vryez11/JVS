package cond.ex;

public class CondEx7 {

    public static void main(String[] args) {
        int x = 10;
        String Odd = (x % 2 == 0) ? "짝수" : "홀수";

        System.out.println("x = " + x + ", " + Odd);
    }
}
