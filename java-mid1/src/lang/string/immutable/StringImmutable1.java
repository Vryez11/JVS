package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        String strtemp = str.concat(" java");
        System.out.println("str = " + str);
        System.out.println("strtemp = " + strtemp);

        //String이 불변 객체인 이유 : 문자율 풀을 통해 최적화를 하는데 이 객체를 변경하면 같은 참조값을 가지는 다른 변수에서 사이드 이펙트가 발생

    }
}
