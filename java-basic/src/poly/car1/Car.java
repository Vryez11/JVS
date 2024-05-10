package poly.car1;

//OCP 원칙 : Open for extension -> 새로운 기능의 추가나 변경 사항이 생겼을 때, 기존 코드는 확장할 수 있어야 한다.
//          Closed for modification -> 기존의 코드는 수정되지 않아야 한다.

//OCP 원리의 핵심 : Car를 사용하는 클라이언트 코드인 Driver 코드의 변경없이 새로운 자동차를 확장할 수 있다.
//Driver가 클라이언트, Car가 서버가 된다!

public interface Car {
    void startEngine();
    void offEngine();
    void pressAccel();
}
