package loop.ex;

public class LoopEx9 {

    public static void main(String[] args) {
        int rows = 10;

        for (int i = 1; i <= rows; i++) {
            for (int j = rows-i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int t = 2*i-1; t >= 1; t--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
