package method;

public class Overloading2 {

    public static void main(String[] args) {
        myMethod(1, 2);
        myMethod(1.2, 3.4);
    }

    public static void myMethod(int a, int b) {
        System.out.println("int " + a + " int " + b);
    }

    public static void myMethod(double a, double b){
        System.out.println("double " + a + " double " + b);
    }
}
