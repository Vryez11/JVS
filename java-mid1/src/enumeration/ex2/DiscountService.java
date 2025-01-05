package enumeration.ex2;

public class DiscountService {

    public int discount (ClassGrade grade, int price) {
        if (grade == ClassGrade.BASIC) {
            return price * 10 / 100;
        } else if (grade == ClassGrade.GOLD) {
            return price * 20 / 100;
        } else if (grade == ClassGrade.DIAMOND) {
            return price * 30 / 100;
        } else {
            return 0;
        }
    }
}
