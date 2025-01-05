package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        
        String Id = email.split("@")[0];
        String Domain = email.split("@")[1];

        System.out.println("Id = " + Id);
        System.out.println("Domain = " + Domain);
    }
}
