package static2;

import oop1.ValueData;

public class ValueDataMain {

    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
    }

    static void add(ValueData valueData) {   //메인함수에 있는 메서드는 다 static을 붙히는 이유 : 메인 메서드가 static이기 떄문에 static이 아니면 사용할 수 없어서!
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
    }
}
