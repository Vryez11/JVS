package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {

    //포멧팅 : 날짜와 시간 데이터를 원하는 포멧의 문자열로 변경하는것, Date -> String
    //파싱 : 문자열을 날짜와 시간 데이터로 변경하는 것, String -> Date

    public static void main(String[] args) {
        //포멧팅 : 날짜를 문자열로 변환
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);
        DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formattedDate = date.format(fomatter);
        System.out.println("날짜와 시간 포멧팅 = " + formattedDate);

        //파싱 : 문자를 날짜로 변환
        String input = "2030년 01월 01일";
        LocalDate parseDate = LocalDate.parse(input, fomatter);
        System.out.println("문자열 파싱 날짜와 시간 = " + parseDate);

    }
}
