package static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello java";

        DecoUtil1 util1s = new DecoUtil1();

        String decoS = util1s.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + decoS);
    }
}
