package time.test2;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period between = Period.between(startDate, endDate);
        long betweenDays = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        System.out.printf("남은 기간: %d년 %d개원 %d일\n", between.getYears(), between.getMonths(), between.getDays());
        System.out.println("디데이: " + betweenDays + "일 남음");
    }
}
