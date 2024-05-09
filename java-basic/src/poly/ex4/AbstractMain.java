package poly.ex4;



public class AbstractMain {

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();            //메서드 오버라이딩 덕분에 오러라이딩된 자식 인스턴스의 메서드 호출할 수 있다.
        System.out.println("동물 소리 테스트 종료");
    }
    private static void moveAnimal(Animal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.sound();            //메서드 오버라이딩 덕분에 오러라이딩된 자식 인스턴스의 메서드 호출할 수 있다.
        System.out.println("동물 이동 테스트 종료");
    }
}
