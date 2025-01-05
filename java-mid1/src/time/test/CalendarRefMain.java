package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class CalendarRefMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalender(year, month);
    }

    private static void printCalender(int year, int month) {
        LocalDate startDate = LocalDate.of(year, month, 1);
        LocalDate endDate = startDate.plusMonths(1);

        int dayValue = startDate.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0; i < dayValue; i++) {
            System.out.print("   ");
        }

        LocalDate countDate = startDate;
        while(countDate.isBefore(endDate)) {
            System.out.printf("%2d ", countDate.getDayOfMonth());
            if(countDate.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                System.out.println();
            }
            countDate = countDate.plusDays(1);
        }
    }
}
