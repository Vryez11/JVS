package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        //참조형의 final : 한번의 참조값만 담고 변경이 불가능하다.
        final Data data = new Data();

        //하지만 참조 대상의 변수는 변경 가능!
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

    }
}
