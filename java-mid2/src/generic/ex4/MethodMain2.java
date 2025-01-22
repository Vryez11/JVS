package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog biggerDog = AnimalMethod.bigger(dog, new Dog("큰 멍멍이", 200));
        Cat biggerCat = AnimalMethod.bigger(cat, new Cat("큰 야옹이", 200));


    }
}
