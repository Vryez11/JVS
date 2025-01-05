package lang.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        int result = adder.getValue();
        System.out.println("result = " + result);

        System.out.println(adder);
        System.out.println(adder1);
        System.out.println(adder2);
        System.out.println(adder3);
    }
}