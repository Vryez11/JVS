package array;

public class Array1Ref2 {

    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        int[] copyStudents;

        students = new int[5]; //배열 생성 -> 생성한 배열의 주소를 students에 보관
        copyStudents = students; //위에서 생성한 배열의 주소를 copyStudents에 전달

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for(int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
