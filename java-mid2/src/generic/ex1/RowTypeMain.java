package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>(); // 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);

        //Generic 타입에 <>을 지정하지 않을 수 있는데 , 이런 것을 row type, 또는 원시 타입이라고 한다.
        // 원시 타입을 사용하면 내부의 타입 매개변수가 Object로 사용된다고 이해하면 된다.


    }
}
