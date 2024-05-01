package method;

public class MethodValue2 {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. chageNumber 호출 전, number: " + number);
        chageNumber(number);
        System.out.println("4. chageNumber 호출 후, number: " + number);
    }

    public static void chageNumber(int number) {
        System.out.println("2. chageNumber 변경 전, number: " + number);
        number *= 2;
        System.out.println("3. chageNumber 변경 후, number: " + number);
    }

}
