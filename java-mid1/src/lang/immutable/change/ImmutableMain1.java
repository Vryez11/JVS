package lang.immutable.change;

public class ImmutableMain1 {

    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj(10);

        System.out.println("immutableObj = " + immutableObj);

        immutableObj = immutableObj.add(20);

        System.out.println("immutableObj = " + immutableObj);
    }
}
