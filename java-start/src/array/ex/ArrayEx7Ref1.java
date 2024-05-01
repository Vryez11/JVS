package array.ex;

import java.util.Scanner;

public class ArrayEx7Ref1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"}; //**과목도 순서에 맞게 배열로 저장해서 뒤에서 처리할 때 쉽게 하자!

        for (int row = 0; row < scores.length; row++) {
            System.out.println((row+1) + "번 학생의 성적을 입력하세요: ");
            for (int column = 0; column < scores[row].length; column++){
                System.out.print(subjects[column] + " 점수: ");
                scores[row][column] = input.nextInt();
            }
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
