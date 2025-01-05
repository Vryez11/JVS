package time.test2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate firstDate = LocalDate.of(year, month, 1);

        DayOfWeek firstDayOfWeek = firstDate.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek();
        DayOfWeek lastDayOfWeek = firstDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);
    }
}
