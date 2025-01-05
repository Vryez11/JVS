package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("바둑이", 5);
        Dog dog2 = new Dog("카이", 2);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = " + refValue);
        //toString을 재정의 해서 참조값을 알 수 없을 때
        //System.identityHashCode(dog1)으로 찾을 수 있고 이를 16진수로
        //Integer.toHexString(System.identityHashCode(dog1));으로 String으로 반환할 수 있다.

    }
}
