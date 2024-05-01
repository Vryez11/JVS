package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647L; //int 최곳값
        long maxIntOver = 2147483648L; //int 최곳값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting intValue = " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOuver casting intValue = " + intValue);
    }
}
