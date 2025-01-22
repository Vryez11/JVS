package generic.animal;

public class Dog extends Animal {


    public Dog(String name, int size) {
        super(name, size);
    }

    //ctrl + o : 오버라이딩 단축키
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
