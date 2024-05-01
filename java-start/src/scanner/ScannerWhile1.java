package scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요: ");
            String str = scanner.nextLine();

            if (str.equals("exit")) break;      //문자열의 비교는 equals 사용!
            else System.out.println("입력한 문자열은 " + str + "입니다.");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
