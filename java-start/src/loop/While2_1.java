package loop;

public class While2_1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while(i < 3){
            i++;
            sum += i;
            System.out.println("sum = " + sum);
        }
    }
}
