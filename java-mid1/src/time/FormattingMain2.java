package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {

    public static void main(String[] args) {
        //포멧팅 : 날짜와 시간을 문자열로 변환
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedString = now.format(formatter);
        System.out.println("날짜와 시간 포멧팅 = " + formattedString);

        //파싱 : 문자열을 날짜로 변환
        String input = "2030-01-01 12:45:15";
        LocalDateTime parsedDate = LocalDateTime.parse(input, formatter);
        System.out.println("문자열 파싱 날짜와 시간 = " + parsedDate);
    }
}