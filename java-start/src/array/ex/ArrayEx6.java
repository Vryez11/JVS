package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int num = scanner.nextInt();

        int[] arr = new int[num];
        int max = 0, min = 0;

        System.out.println(num + "개의 정수를 입력하세요");

        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            if (i == 0) max = min = arr[i]; //이렇게 대입연산자 사용가능!
            if (arr[i] >= max) max = arr[i];
            else if (arr[i] <= min) min = arr[i];
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);

    }
}
