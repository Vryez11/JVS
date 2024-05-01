package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("두 정수를 입력하시오(0을 입력하면 종료): ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int sum = num1 + num2;

            if (num1 == 0 && num2 == 0) break;
            else System.out.println("두 정수의 합은 " + sum + "입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
