package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 0을 입력하면 프로그램은 종료됩니다.");
        int sum = 0;

        while(true) {
            System.out.print("정수를 입력하시오: ");
            int num1 = scanner.nextInt();

            if (num1 == 0) break;
            else sum += num1;
        }
        System.out.println("총 합계는 " + sum +"이며 프로그램을 종료합니다.");
    }
}
