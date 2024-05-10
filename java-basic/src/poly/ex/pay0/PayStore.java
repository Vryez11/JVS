package poly.ex.pay0;

public class PayStore {
    private static Pay pay;

    public static void pay(String option, int amount) {
        boolean result;

        if (option.equals("kakao")) {
            pay = new KakaoPay();
            result = pay.pay(amount);
        } else if (option.equals("naver")) {
            pay = new NaverPay();
            result = pay.pay(amount);
        } else {
            pay = new DefaultPay();
            result = pay.pay(amount);
        }

        if (result) System.out.println("결제가 성공했습니다.");
        else System.out.println("결제가 실패했습니다.");
    }
}
