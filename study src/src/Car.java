public class Car {

    private int speed;

    public void speedUp(int amount) {
        System.out.println("속도를 설정합니다.");
        setSpeed(amount);
    }

    private void setSpeed(int amount) {
        speed = amount;
    }
}
