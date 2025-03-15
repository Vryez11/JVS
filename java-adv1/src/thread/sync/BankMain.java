package thread.sync;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BankMain {

    public static void main(String[] args) throws InterruptedException {
        // BankAccount account = new BankAccountV1(1000);
        // BankAccount account = new BankAccountV2(1700);
        // BankAccount account = new BankAccountV3(1000);
        // BankAccountV4 account = new BankAccountV4(2100);
        // BankAccountV5 account = new BankAccountV5(1000);
        BankAccountV6 account = new BankAccountV6(1000);

        Thread t1 = new Thread(new WithdrawTask(account, 800), "t1");
        Thread t2 = new Thread(new WithdrawTask(account, 800), "t2");
        Thread t3 = new Thread(new WithdrawTask(account, 800), "t3");

        t1.start();
        t2.start();
        t3.start();

        sleep(500); // 검증 완료 까지 잠시 대기
        log("t1 state: " + t1.getState() + ", t2 state: " + t2.getState() + ", t3 state: " + t3.getState());

        t1.join();
        t2.join();
        t3.join();

        log("최종 잔액: " + account.getBalance());
    }
}
