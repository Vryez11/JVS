package nested.inner.ex2;

public class Car {

    private String model;
    private int chrageLevel;
    private Engine engine;

    public Car(String model, int chrageLevel) {
        this.model = model;
        this.chrageLevel = chrageLevel;
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    private class Engine {
        private void start() {
            System.out.println("충전 레벨 확인: " + chrageLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}
