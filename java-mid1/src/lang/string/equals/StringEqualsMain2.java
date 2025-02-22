package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));

    }

    private static boolean isSame(String x, String y) {
        //return x == y;
        return x.equals(y); //문자열 비교할 때 객체를 만든 것인지, 문자열 풀에 있는 것을 넘겨 줄지 모르기 때문에 항상 equals를 통해 동등성 비교를 해야한다.
    }
}
