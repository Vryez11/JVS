package poly.basic;

public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        //업캐스팅 (자식-> 부모)
        Parent parent1 = (Parent) child;    //업캐스팅은 생략 가능, 생략이 권장 된다!
        Parent parent2 = child;

        System.out.println("child = " + child);
        System.out.println("parent1 = " + parent1);
        System.out.println("parent2 = " + parent2);

        parent1.parentMethod();
        parent2.parentMethod();

        //업캐스팅은 생략할 수 있다. 다운캐스팅은 생략할 수 없다. 참고로 업캐스팅은 매우 자주 사용하기 때문에 생략을 권장한다.
    }
}
