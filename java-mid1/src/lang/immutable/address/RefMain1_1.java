package lang.immutable.address;

public class RefMain1_1 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 굥유할 수 있다.

        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산"); //b의 값을 부산으로 변경해야함
        System.out.println("부산 -> b");
        System.out.println("a = " + a); //사이드 이펙트 발생
        System.out.println("b = " + b);

        //사이트 이펙트 : 프로그래밍에서 어떤 계산이 주된 작업 외에 추가적인 부수
        //              효과를 일으키는 것을 말한다.


    }
}
