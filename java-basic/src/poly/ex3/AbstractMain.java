package poly.ex3;

public class AbstractMain {

    public static void main(String[] args) {
        AbstractAnimal[] animals = {new Dog(), new Cat(), new Caw()};

        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
            animal.move();
        }
    }

    //변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();            //메서드 오버라이딩 덕분에 오러라이딩된 자식 인스턴스의 메서드 호출할 수 있다.
        System.out.println("동물 소리 테스트 종료");
    }
}
