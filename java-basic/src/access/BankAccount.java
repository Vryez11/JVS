package access;

public class BankAccount {

    //private로 데이터를 잘막음
    private int balance;

    //ALT + INSERT : 제네레이터 (생성자 바로 만들어주는 단축키)

    public BankAccount() {
        balance = 0;
    }

    //public 메서드
    public void deposit(int amount) {
        if (isAmountValid(amount)) balance += amount;
        else System.out.println("유효하지 않은 금액입니다.");
    }

    //내부에서만 쓰는 메서드는 private로 잘 막음
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) balance -= amount;
        else System.out.println("유효하지 않은 금액이거나 잔고가 부족합니다.");
    }

    public int getBalance() {
        return  balance;
    }
}
