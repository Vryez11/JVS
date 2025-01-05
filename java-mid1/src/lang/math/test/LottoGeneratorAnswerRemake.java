package lang.math.test;

import java.util.Random;

public class LottoGeneratorAnswerRemake {

    private final Random rand = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            int randNum = rand.nextInt(45) + 1;

            if(isUnique(randNum)) {
                lottoNumbers[count] = randNum;
                count++;
            }
        }

        return lottoNumbers;
    }

    private boolean isUnique(int number) {

        for (int i = 0; i < lottoNumbers.length; i++) {
            if (lottoNumbers[i] == number) return false;
        }
        return true;
    }
}
