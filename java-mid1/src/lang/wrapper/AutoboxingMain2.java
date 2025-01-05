package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValeu = value;  //오토 박싱(Auto-boxing)

        // Wrapper -> Primitive
        int unboxedValeu = boxedValeu;  //오토 언박싱(Auto-Unboxing)

        System.out.println("boxedValeu = " + boxedValeu);
        System.out.println("unboxedValeu = " + unboxedValeu);


    }
}
