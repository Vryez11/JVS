package lang.wrapper.test;

public class WrapperTest2 {

    public static void main(String[] args) {

        String[] array = {"1.5", "2.5", "3.0"};

        double doubleSum = 0;

        for (String dN : array) {
            doubleSum += Double.parseDouble(dN);
        }

        System.out.println("배열의 합: " + doubleSum);
    }
}
