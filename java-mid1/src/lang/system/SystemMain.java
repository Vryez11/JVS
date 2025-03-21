package lang.system;

import java.lang.reflect.Method;
import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다.
        long cuurentTimeNano = System.nanoTime();
        System.out.println("cuurentTimeNano = " + cuurentTimeNano);

        // 환경 변수를 읽는다.
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] oribianlArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(oribianlArray, 0, copiedArray, 0, oribianlArray.length);
        
        // 배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
    }
}
