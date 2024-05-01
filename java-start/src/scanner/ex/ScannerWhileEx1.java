package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = scanner.nextLine();
            if (name.equals("종료")) break;

            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt(); // '\n' 를 읽지 않아서 '\n'가 남아 있어서
            scanner.nextLine(); // 여기서 이를 처리해줘야 함.

            System.out.println("입력한 이름: " + name +", 나이: " + age);
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
