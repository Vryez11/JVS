package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        
        date2 = date2.withYear(2025); //불변 객체 값 변경은 객체를 반환

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        Object obj = new Object();



    }
}
