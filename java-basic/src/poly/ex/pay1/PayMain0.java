package poly.ex.pay1;

import access.ex.ShoppingCart;

import java.util.Scanner;

public class PayMain0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("결제 수단을 입력하세요: " );
            String option = scanner.nextLine();

            if (option.equals("exit")) return;

            System.out.print("결제 금액을 입력하세요: " );
            int amount = scanner.nextInt();
            scanner.nextLine();

            PayService.processPay(option, amount);
        }
    }
}
