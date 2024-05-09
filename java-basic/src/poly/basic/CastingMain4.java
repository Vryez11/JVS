package poly.basic;

//다운 캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();               //문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;     //런타임 오류 : ClassCastException
        child2.childMethod();               //실행 불가

        //업캐스팅은 안전하고 다운캐스팅은 위험한 이유 :
        //업캐스팅의 경우에는 위의 위험한 상황 발생 X, 왜냐하면 상위 부모 타입은 모두 생성되기 떄문에!!

        //컴파일 오류 VS 런타임 오류
        //컴파일 오류 : 자바 프로그램을 실행하기 전에 발생하는 오류. IDE에서 즉시 확인가능한 오류
        //런타임 오류 : 프로그램이 실행되고 있는 시점에 발생하는 오류.
    }
}
