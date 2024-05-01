package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");

        int sum = 0;
        int count = 0;
        int num;
        double avg;
/*
        while(true) {
            int num = input.nextInt();
            if (num == -1) break;

            sum += num;
            count++;
        }

 */
        while((num = input.nextInt()) != -1) {         //좀 더 간단하게 코드를 작성할 수 있다! 무조건 true가 아닌 조건문에서 -1을 확인하는 것! 많이 쓰이니 반드시 생각!
            sum += num;
            count++;
        }

        avg = (double) sum / count;

        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);
    }
}
