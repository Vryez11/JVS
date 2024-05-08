package extends1.overriding;

public class ElectricCar extends Car {

    //오버로딩: 같은 메서드 이름에서 매개변수(파라미터)가 다른 메서드를 여러개 정의하는 것을 메서드 오버로딩
    //오버라이딩(메서드 재정의): 하위 클래스에서 상위 클래스의 메서드를 재정의하는 과정

    @Override //실수 방지를 해준다!, 없어도 동작은 한다.
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("차를 충전합니다.");
    }


}
