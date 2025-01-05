package time.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimePlus {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        System.out.println("기준 시각: " + dt);
        LocalDateTime plusDt = dt.plus(1, ChronoUnit.YEARS).plus(2, ChronoUnit.MONTHS).plus(3, ChronoUnit.DAYS).plus(4, ChronoUnit.HOURS);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + plusDt);
    }
}
