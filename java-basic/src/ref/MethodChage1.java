package ref;

public class MethodChage1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a); //10
        chagePrimitive(a);
        System.out.println("메서드 호출 후 : a = " + a); //10
    }

    static void chagePrimitive(int a) {
        a = 20;
    }
}
