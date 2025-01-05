package lang.string.test;

public class TestString1 {

    public static void main(String[] args) {
        String url1 = "https://www.example.com";

        boolean result = url1.startsWith("http://");

        if (result) {
            System.out.println("알맞은 경로입니다.");
        } else {
            System.out.println("틀린 경로입니다.");
        }
    }
}
