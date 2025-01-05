package time.test2;

import java.time.LocalDate;

public class TestLoopPlus {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.of(2024, 1, 1);
        LocalDate changeDate = currentDate;

        for (int i = 0; i < 5; i++) {
            changeDate = changeDate.plusWeeks(2);
            System.out.println("날짜 1: " + changeDate);
        }
    }
}
