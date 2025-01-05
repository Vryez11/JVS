package lang.immutable.address;

public class RefMain1_2 {

    //사이드 이펙트 방지 : a, b의 객체를 따로 선언해주어서 ! (생각보다 단순)
    public static void main(String[] args) {
        Address a = new Address("서울"); //x001
        Address b = new Address("서울"); //x002
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
