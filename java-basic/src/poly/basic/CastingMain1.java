package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조 (다항적 참조)
        Parent poly = new Child();

        //단 자식의 기능흘 호출할 수 없다. : poly.childMethod() X 컴파일 오류

        //다운캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly;
        child.childMethod();
    }
}
