package lang.math.test;

public class LottoMain {

    public static void main(String[] args) {
        LottoGenerator lotto = new LottoGenerator();

        System.out.println(lotto);

        lotto.LottoReGenerator();

        System.out.println(lotto);
    }
}
