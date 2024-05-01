package scanner.ex;

public class ChangeVarEx {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        System.out.println("a = " + a + ", b = " + b);

        int temp = b;
        b = a;
        a = temp;

        System.out.println("a = " + a + ", b = " + b);
    }
}
