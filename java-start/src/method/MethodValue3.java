package method;

public class MethodValue3 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("chageNumber 호출 전, num1: " + num1);
        num1 = chageNumber(num1);
        System.out.println("chageNumber 호출 후, num1: " + num1);
    }

    public static int chageNumber(int num2) {
        num2 *= 2;
        return num2;
    }

}
