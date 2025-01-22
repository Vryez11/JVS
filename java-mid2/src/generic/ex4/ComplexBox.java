package generic.ex4;

import generic.animal.Animal;

public class ComplexBox <T extends Animal> {

    private T animal;

    public void set (T animal) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T t) {
        System.out.println("animal.classname: " +  animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        return t;
    }

    //제네릭 타입보다 제네릭 메서드가 우선순위를 가진다.
    //위의 제네릭 메서드는 상한 (타입 매게변수 제한)이 없기 때문에 Object 기능만 사용 가능
}
