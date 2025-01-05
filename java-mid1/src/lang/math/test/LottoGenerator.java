package lang.math.test;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {

    private final Random rand = new Random();
    private final int[] lottoNums = new int[6];
    private final int[] lottoNumsIns = new int[6];

    public LottoGenerator() {
        for (int i = 0; i < 6; i++) {
            lottoNums[i] = rand.nextInt(45) + 1;
            if (i == 0) {
                lottoNumsIns[i] = lottoNums[i];
            } else {
                lottoNumsIns[i] = lottoNums[i];
                int whilecount = 0;
                while (whilecount <= i) {
                    if (lottoNumsIns[whilecount] != lottoNums[i]) {
                        whilecount++;
                    } else {
                        lottoNums[i] = rand.nextInt(45) + 1;
                    }
                }
            }
        }
    }

    public void LottoReGenerator() {
        for (int i = 0; i < 6; i++) {
            lottoNums[i] = rand.nextInt(45) + 1;
            if (i == 0) {
                lottoNumsIns[i] = lottoNums[i];
            } else {
                lottoNumsIns[i] = lottoNums[i];
                int whilecount = 0;
                while (whilecount <= i) {
                    if (lottoNumsIns[whilecount] != lottoNums[i]) {
                        whilecount++;
                    } else {
                        lottoNums[i] = rand.nextInt(45) + 1;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "로또 번호=" + Arrays.toString(lottoNums);
    }
}
