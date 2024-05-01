package method.ex;

public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 100000;

        balance = depositAmount(balance, 10000);
        balance = withdrawAmount(balance, 5000);
        balance = withdrawAmount(balance, 10000000);

        System.out.println("최종 잔액: " + balance + " 원");
    }
    public static int depositAmount(int balance, int amount) {
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + (balance + amount) + "원");
        return balance + amount;
    }
    public static int withdrawAmount(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        }
        else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
