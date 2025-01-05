package enumeration.ref1;

public class DiscountService {

    public int discount(ClassGrade grade, int price) {
        return price * grade.getDiscountPercent() / 100;

        // 단축키 ctrl + alt + n = inline Variable 변수를 자동으로 합쳐준다
    }
}
