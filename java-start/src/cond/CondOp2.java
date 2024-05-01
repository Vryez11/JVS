package cond;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자"; //삼항연산자 ?: -> 조건이니? 참:거짓 으로 쉽게 이해하자!
        System.out.println("status = " + status);
    }
}
