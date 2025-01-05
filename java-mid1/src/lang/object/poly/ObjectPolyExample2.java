package lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        //new Dog() 후 cntl + alt + v 하면 자동 변수 완성을 해준다.

        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();

        Object[] objects = {dog, car, object};

        //alt + enter 하면 자동으로 문제를 해결해주는 선택지를 고를 수 있다.
        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);
    }
}
