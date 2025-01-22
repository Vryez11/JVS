package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<Cat>();

        // Animal 포함 상위 타입 전달 가능 (하한)
        writeBox(objBox);
        writeBox(animalBox);

        //와일드 카드는 상한과 하한 지정 가능
        //extends와 super
    }

    //super 자신 보다 상위의 클래스 매개변수로 지정 가능
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
