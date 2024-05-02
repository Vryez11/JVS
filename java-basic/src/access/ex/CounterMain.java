package access.ex;

public class CounterMain {

    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(5);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int tempCounter = counter.getCount();
        System.out.println("tempCounter = " + tempCounter);
    }
}
