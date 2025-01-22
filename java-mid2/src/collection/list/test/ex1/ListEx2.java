package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int input;

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        do {
            input = sc.nextInt();
            if (input != 0) list.add(input);
        } while (input != 0);

        System.out.println("출력");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
    }
}
