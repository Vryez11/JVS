package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int input, total = 0;

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        do {
            input = sc.nextInt();
            if (input != 0) list.add(input);
            total += input;
        } while (input != 0);

        System.out.println("입력한 점수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + (double) total / list.size());
    }
}
