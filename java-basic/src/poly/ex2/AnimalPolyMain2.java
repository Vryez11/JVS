package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        Animal[] animals = {dog, cat, caw, duck}; //다형적 참조 덕분에 Dog, Cat, Caw의 인스턴스를 참조 받을 수 있다.


        for (Animal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();            //메서드 오버라이딩 덕분에 오러라이딩된 자식 인스턴스의 메서드 호출할 수 있다.
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
