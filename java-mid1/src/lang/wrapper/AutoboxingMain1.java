package lang.wrapper;

public class AutoboxingMain1 {

    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValeu = Integer.valueOf(value);

        // Wrapper -> Primitive
        int unboxedValeu = boxedValeu.intValue();

        System.out.println("boxedValeu = " + boxedValeu);
        System.out.println("unboxedValeu = " + unboxedValeu);
    }
}
