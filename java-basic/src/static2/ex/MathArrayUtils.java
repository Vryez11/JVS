package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {
    public static int sum(int[] values){
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }
    public static double avg(int[] values){
        return (double) sum(values) / values.length;  //static 메서드를 가져다가 쉽게 코드 작성!!
    }
    public static int min(int[] values){
        int min = values[0];
        for (int value : values) {
            if (min > value) min = value;
        }
        return min;
    }
    public static int max(int[] values){
        int max = values[0];
        for (int value : values) {
            if (max < value) max = value;
        }return max;
    }

    private MathArrayUtils() {

    }
}
