package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
        int totalPrice = 0;
        int option;

        while ((option = input.nextInt()) != 3) {
            if (option == 1) {
                input.nextLine();
                System.out.print("상품명을 입력하세요: ");
                String name = input.nextLine();
                System.out.print("상품의 가격을 입력하세요: ");
                int price = input.nextInt();
                System.out.print("구매 수량을 입력하세요: ");
                int quantity = input.nextInt();
                input.nextLine();

                totalPrice += price*quantity;
            }
            else if (option == 2) {
                System.out.println("총 비용: " + totalPrice);
                totalPrice = 0;
            }
            else System.out.println("올바른 숫자를 입력해주세요.");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
