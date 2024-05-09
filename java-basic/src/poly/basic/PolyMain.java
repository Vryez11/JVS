package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조 (다형적 참조) : 부모 타입의 변수가 자식 인스턴스를 참조 **부모는 자식을 담을 수 있다.**, 자바에서 부모 타입은 자신은 물론이고,
        //자신을 기준으로 모든 자식 타입을 참조할 수 있다. 이것이 바로 다양한 형태를 참조할 수 있다고 해서 다형적 참조라고 한다.
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        //Child child1 = new Parent(); //자식은 부모를 담을 수 없다.

        //자식의 기능을 호출할 수 없다! (좀 충격)
        //poly.childMethod(); //호출 불가능 -> poly는 Parent 타입이다. 따라서 Parent 클래스부터 시작해서 필요한 기능을 찾는다. 그런데 상속 관계는 부모 방향으로 찾아 올라갈
        //                                   수는 있지만, 자식방향으로 찾아 내려갈 수는 없다.


    }
}
