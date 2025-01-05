package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

    public static void main(String[] args) {

        int year = 2024;
        int month = 1;

        LocalDate lD = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = lD.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek();
        DayOfWeek lastDayOfWeek = lD.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);
    }
}
