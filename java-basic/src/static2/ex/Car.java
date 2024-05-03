package static2.ex;

public class Car {
    private String carName;
    private static String[] cars = new String[5];
    private static int count = 0;

    Car (String carName) {
        this.carName =  carName;
        cars[count] = carName;
        count++;
    }

    static void showTotalCars() {
        for (int i = 0; i < count; i++) {
            System.out.println("차량 구입, 이름 : " + cars[i]);
        }
        System.out.println("구매한 차량 수 : " + count);
    }
}
