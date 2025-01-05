package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교: " + (str1.equals(str2)));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
        //문자열 리터럴을 사용하는 경우 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용한다.
        //자바가 실행되는 시점에 클래스에 문자열 리터럴이 있으면 문자열 풀에 String 인스턴스를 미리 만들어 둔다. 이 때 같은 문자열이 있으면 중복 생성 X
        //문자열 풀에서 "hello"라는 문자를 가진 String 인스턴스를 찾고 이를 참조 반환한다.
        //문자열 풀 덕분에 str3와 str4는 같은 참조값을 가지므로 == 비교에 성공한 것

        //풀(Pool) : 자원이 모여 있는 곳을 의미한다. 프로그래밍에서 굥용 자원을 모아둔 곳을 뜻한다.

    }
}
