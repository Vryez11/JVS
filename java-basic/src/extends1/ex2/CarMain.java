package extends1.ex2;

import extends1.ex1.ElectricCar;
import extends1.ex1.GasCar;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        GasCar gasCar = new GasCar();

        electricCar.move();
        electricCar.charge();

        gasCar.move();
        gasCar.fillUp();
    }
}
