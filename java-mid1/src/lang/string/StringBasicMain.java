package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello"); //자바에서 편의를 위해 객체 생성을 쌍따움표로 해주는 것이다.

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
