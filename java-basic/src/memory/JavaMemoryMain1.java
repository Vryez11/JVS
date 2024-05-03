package memory;

public class JavaMemoryMain1 {

    public static void main(String[] args) {
        System.out.println("main start");
        method(10);
        System.out.println("main end"); //Ctrl+w : 커서의 단어 한번에 블록 선택 굉장히 편함!
    }

    static void method(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method end");
    }
    static  void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end ");
    }
}
