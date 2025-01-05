package lang.string.test;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";
        
        String resultStr= new StringBuffer().append(str).reverse().toString();

        System.out.println("resultStr = " + resultStr);
    }
}
