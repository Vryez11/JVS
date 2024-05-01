package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        int balance = 10000;
        menu(balance);
    }

    public static void menu(int balance) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("--------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("--------------------------------------");
            System.out.print("선택: ");
            int menu = scanner.nextInt();

            String str = " ";

            //switch 문으로 바꿀 수도 있음! switch가 깔끔해보인다..
            if (menu == 1) balance = deposit(balance);
            else if (menu == 2) balance = withdraw(balance);
            else if (menu == 3) System.out.println("현재 잔액: " + balance + "원");
            else if (menu == 4) break;
            else {
                System.out.println("--------------------------------------");
                System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
                System.out.println("--------------------------------------");
            }
        }
    }

    public static int deposit(int balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입금액을 입력하세요: ");
        int amount = scanner.nextInt();
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance);

        return  balance;
    }
    public static int withdraw(int balance) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출금액을 입력하세요: ");
        int amount = scanner.nextInt();
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance);
        }
        else System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");

        return balance;
    }
}
