package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstance = 3;

    public void process(int paramVar) {
        int localVar = 1;

        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstance = " + outInstance);
            }
        };

        printer.print();
        System.out.println("printer.class=" + printer.getClass());
    }

    //익명 클래스를 사용하면 코드가 간결해진다는 장점이 있다.

    public static void main(String[] args) {
        AnonymousOuter anonymousOuter = new AnonymousOuter();
        anonymousOuter.process(2);
    }
}
