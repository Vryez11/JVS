package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class CalendarMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);
        LocalDate with = date.with(TemporalAdjusters.lastDayOfMonth());
        DayOfWeek day = date.getDayOfWeek();
        long between = ChronoUnit.DAYS.between(date, with) + 1;

        System.out.println("Su Mo Tu We Th Fr Sa");

        printCalender(day, between);
    }

    private static void printCalender(DayOfWeek day, long dyas) {
        if (day == DayOfWeek.SUNDAY) {
            if (dyas == 31) {
                System.out.println("""
                         1  2  3  4  5  6  7
                         8  9 10 11 12 13 14
                        15 16 17 18 19 20 21
                        22 23 24 25 26 27 28
                        29 30 31""");
            } else if (dyas == 30) {
                System.out.println("""
                         1  2  3  4  5  6  7
                         8  9 10 11 12 13 14
                        15 16 17 18 19 20 21
                        22 23 24 25 26 27 28
                        29 30""");
            } else if (dyas == 29) {
                System.out.println("""
                         1  2  3  4  5  6  7
                         8  9 10 11 12 13 14
                        15 16 17 18 19 20 21
                        22 23 24 25 26 27 28
                        29""");
            } else if (dyas == 28) {
                System.out.println("""
                         1  2  3  4  5  6  7
                         8  9 10 11 12 13 14
                        15 16 17 18 19 20 21
                        22 23 24 25 26 27 28""");
            }
        } else if (day == DayOfWeek.MONDAY) {
            if (dyas == 31) {
                System.out.println("""
                            1  2  3  4  5  6
                         7  8  9 10 11 12 13
                        14 15 16 17 18 19 20
                        21 22 23 24 25 26 27
                        28 29 30 31""");
            } else if (dyas == 30) {
                System.out.println("""
                            1  2  3  4  5  6
                         7  8  9 10 11 12 13
                        14 15 16 17 18 19 20
                        21 22 23 24 25 26 27
                        28 29 30""");
            } else if (dyas == 29) {
                System.out.println("""
                            1  2  3  4  5  6
                         7  8  9 10 11 12 13
                        14 15 16 17 18 19 20
                        21 22 23 24 25 26 27
                        28 29""");
            } else if (dyas == 28) {
                System.out.println("""
                            1  2  3  4  5  6
                         7  8  9 10 11 12 13
                        14 15 16 17 18 19 20
                        21 22 23 24 25 26 27
                        28""");
            }
        } else if (day == DayOfWeek.TUESDAY) {
            if (dyas == 31) {
                System.out.println("""
                               1  2  3  4  5
                         6  7  8  9 10 11 12
                        13 14 15 16 17 18 19
                        20 21 22 23 24 25 26
                        27 28 29 30 31""");
            } else if (dyas == 30) {
                System.out.println("""
                               1  2  3  4  5
                         6  7  8  9 10 11 12
                        13 14 15 16 17 18 19
                        20 21 22 23 24 25 26
                        27 28 29 30""");
            } else if (dyas == 29) {
                System.out.println("""
                               1  2  3  4  5
                         6  7  8  9 10 11 12
                        13 14 15 16 17 18 19
                        20 21 22 23 24 25 26
                        27 28 29""");
            } else if (dyas == 28) {
                System.out.println("""
                               1  2  3  4  5
                         6  7  8  9 10 11 12
                        13 14 15 16 17 18 19
                        20 21 22 23 24 25 26
                        27 28""");
            }
        } else if (day == DayOfWeek.WEDNESDAY) {
            if (dyas == 31) {
                System.out.println("""
                                  1  2  3  4
                         5  6  7  8  9 10 11
                        12 13 14 15 16 17 18
                        19 20 21 22 23 24 25
                        26 27 28 29 30 31""");
            } else if (dyas == 30) {
                System.out.println("""
                                  1  2  3  4
                         5  6  7  8  9 10 11
                        12 13 14 15 16 17 18
                        19 20 21 22 23 24 25
                        26 27 28 29 30""");
            } else if (dyas == 29) {
                System.out.println("""
                                  1  2  3  4
                         5  6  7  8  9 10 11
                        12 13 14 15 16 17 18
                        19 20 21 22 23 24 25
                        26 27 28 29""");
            } else if (dyas == 28) {
                System.out.println("""
                                  1  2  3  4
                         5  6  7  8  9 10 11
                        12 13 14 15 16 17 18
                        19 20 21 22 23 24 25
                        26 27 28""");
            }
        } else if (day == DayOfWeek.THURSDAY) {
            if (dyas == 31) {
                System.out.println("""
                                     1  2  3
                         4  5  6  7  8  9 10
                        11 12 13 14 15 16 17
                        18 19 20 21 22 23 24
                        25 26 27 28 29 30 31""");
            } else if (dyas == 30) {
                System.out.println("""
                                     1  2  3
                         4  5  6  7  8  9 10
                        11 12 13 14 15 16 17
                        18 19 20 21 22 23 24
                        25 26 27 28 29 30""");
            } else if (dyas == 29) {
                System.out.println("""
                                     1  2  3
                         4  5  6  7  8  9 10
                        11 12 13 14 15 16 17
                        18 19 20 21 22 23 24
                        25 26 27 28 29""");
            } else if (dyas == 28) {
                System.out.println("""
                                     1  2  3
                         4  5  6  7  8  9 10
                        11 12 13 14 15 16 17
                        18 19 20 21 22 23 24
                        25 26 27 28""");
            }
        } else if (day == DayOfWeek.FRIDAY) {
            if (dyas == 31) {
                System.out.println("""
                                        1  2
                         3  4  5  6  7  8  9
                        10 11 12 13 14 15 16
                        17 18 19 20 21 22 23
                        24 25 26 27 28 29 30
                        31""");
            } else if (dyas == 30) {
                System.out.println("""
                                        1  2
                         3  4  5  6  7  8  9
                        10 11 12 13 14 15 16
                        17 18 19 20 21 22 23
                        24 25 26 27 28 29 30""");
            } else if (dyas == 29) {
                System.out.println("""
                                        1  2
                         3  4  5  6  7  8  9
                        10 11 12 13 14 15 16
                        17 18 19 20 21 22 23
                        24 25 26 27 28 29""");
            } else if (dyas == 28) {
                System.out.println("""
                                        1  2
                         3  4  5  6  7  8  9
                        10 11 12 13 14 15 16
                        17 18 19 20 21 22 23
                        24 25 26 27 28""");
            }
        } else {
            if (dyas == 31) {
                System.out.println("""
                                           1
                         2  3  4  5  6  7  8
                         9 10 11 12 13 14 15
                        16 17 18 19 20 21 22
                        23 24 25 26 27 28 29
                        30 31""");
            } else if (dyas == 30) {
                System.out.println("""
                                           1
                         2  3  4  5  6  7  8
                         9 10 11 12 13 14 15
                        16 17 18 19 20 21 22
                        23 24 25 26 27 28 29
                        30""");
            } else if (dyas == 29) {
                System.out.println("""
                                           1
                         2  3  4  5  6  7  8
                         9 10 11 12 13 14 15
                        16 17 18 19 20 21 22
                        23 24 25 26 27 28 29""");
            } else if (dyas == 28) {
                System.out.println("""
                                           1
                         2  3  4  5  6  7  8
                         9 10 11 12 13 14 15
                        16 17 18 19 20 21 22
                        23 24 25 26 27 28""");
            }
        }
    }
}
