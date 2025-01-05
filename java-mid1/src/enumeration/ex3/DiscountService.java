package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class DiscountService {

    public int discount (Grade grade, int price) {
        int discount = 0;

        if (grade == BASIC) {
            discount = 10;
        } else if (grade == GOLD) {
            discount = 20;
        } else if (grade == DIAMOND) {
            discount = 30;
        } else {
            System.out.println("할일 X");
        }

        return price * discount / 100;
    }
}
