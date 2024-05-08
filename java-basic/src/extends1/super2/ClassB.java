package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        this(a, 200);    //자식 클래스에서 부모 클래스 생성자 선언을 언젠가는 반드시 호출해야함!
        System.out.println("ClassB 생성자 a= " + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a= " + a + ", b= " + b);
    }
}
