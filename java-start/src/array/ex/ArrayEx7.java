package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] scores = new int[4][3];

        for (int row = 0; row < scores.length; row++) {
            System.out.println((row+1) + "번 학생의 성적을 입력하세요: ");
            System.out.print("국어 점수: ");
            scores[row][0] = input.nextInt();
            System.out.print("영어 점수: ");
            scores[row][1] = input.nextInt();
            System.out.print("수학 점수: ");
            scores[row][2] = input.nextInt();
        }

        for (int row = 0; row < scores.length; row++) {
            int total = 0;
            double avg;
            for (int column = 0; column < scores[row].length; column++) {
                total += scores[row][column];
            }
            avg = (double) total / scores[row].length;
            System.out.print((row + 1) + "번 학생의 총점: " + total + ", ");
            System.out.println("평균: " + avg);
        }
    }
}
