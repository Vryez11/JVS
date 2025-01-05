package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); //인스턴스를 참조해서 객체 생성
        
        inner.print();
        System.out.println("inner Class = " + inner.getClass());
    }
}
