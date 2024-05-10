package poly.ex.pay0;

public class PayService {
    public void processPay(String payOption, int amount) {
        System.out.println("결제를 시작합니다: option=" + payOption + ", amount =" + amount);

        PayStore.pay(payOption, amount);
    }
}
