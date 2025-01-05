package time.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

    public static void main(String[] args) {
        ZonedDateTime seoulTime = ZonedDateTime.of(2024, 1, 1, 9, 0, 0, 0, ZoneId.of("Asia/Seoul"));
        ZoneId londonId = ZoneId.of("Europe/London");
        ZoneId newyorkId = ZoneId.of("America/New_York");

        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(londonId);
        ZonedDateTime newyorkTime = seoulTime.withZoneSameInstant(newyorkId);

        System.out.println("서울의 회의 시간 = " + seoulTime);
        System.out.println("런던의 회의 시간 = " + londonTime);
        System.out.println("뉴욕의 회의 시간 = " + newyorkTime);
    }
}
