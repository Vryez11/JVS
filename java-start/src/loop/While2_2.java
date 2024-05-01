package loop;

public class While2_2 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        int endNum = 10;

        while(i < endNum){
            i++;
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
        }
    }
}
