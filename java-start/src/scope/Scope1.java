package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10;

        if(true) {
            int x = 20;
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } //변수 x 생존 X
        //System.out.println("main x = " + x);
        System.out.println("main m = " + m);
    }
}
