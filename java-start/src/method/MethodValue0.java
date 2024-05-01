package method;

// *****자바는 항상 변수의 값을 복사해서 대입한다!!*****

public class MethodValue0 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = num1;
        num2 = 5;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
