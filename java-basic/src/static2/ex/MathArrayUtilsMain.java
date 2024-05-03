package static2.ex;

import static static2.ex.MathArrayUtils.*;  //import static (패키지명).(클래스명).*;

public class MathArrayUtilsMain {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum = " + sum(values));     //alt + Enter : 문제점이 창으로 뜸! 굉장히 편리함 !!
        System.out.println("avg = " + avg(values));
        System.out.println("min = " + min(values));
        System.out.println("max = " + max(values));
    }
}
