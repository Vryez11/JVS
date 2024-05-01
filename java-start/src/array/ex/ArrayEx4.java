package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int total = 0;

        for (int i : arr) {
            total += i;
        }

        double avg = (double) total / arr.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
