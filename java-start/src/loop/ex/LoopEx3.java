package loop.ex;

public class LoopEx3 {

    public static void main(String[] args) {
        int num = 1;
        int count = 0;
        while (count < 10) {
            if (num % 2 == 0) {
                System.out.println(num);
                ++count;
                ++num;
            }
            else ++num;
        }
    }
}
