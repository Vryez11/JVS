package cond;

public class Switch4 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon = switch (grade){ //자바 14 이후 업그레이드 된 switch문
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("발급받은 쿠폰 : " + coupon);
    }
}
