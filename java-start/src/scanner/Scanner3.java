package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하시오: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번쨰 정수를 입력하시오: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) System.out.println("더 큰 숫자는 " + num1 + "입니다.");
        else System.out.println("더 큰 숫자는 " + num2 + "입니다.");
    }
}
