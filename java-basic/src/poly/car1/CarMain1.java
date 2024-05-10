package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        Car car1 = new K3Car();
        Car car2 = new Model3Car();
        Car car3 = new NewCar();

        driver.setCar(car1);
        driver.drive();

        driver.setCar(car2);
        driver.drive();

        driver.setCar(car3);
        driver.drive();
    }
}
