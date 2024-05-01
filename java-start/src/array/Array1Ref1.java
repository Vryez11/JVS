package array;

public class Array1Ref1 {

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

        System.out.println("copyStudents = " + copyStudents); //[I : int형 배열, @뒤의 값이 주소
        System.out.println("copyStudents = " + copyStudents[0]); //copyStudents[0] == students[0] 같은 배열 공간 사용 (주소가 같기 때문에)
        copyStudents[1] = 0;

        System.out.println("students = " + students); //참조값(주소) 값 저장
        System.out.println("students = " + students[0]);
        System.out.println("students = " + students[1]); //copyStudents[1]의 값이 변경되었고 students[1]의 값도 변경 : 같은 배열 공간을 사용하기 때문에
        System.out.println("students = " + students[2]);
        System.out.println("students = " + students[3]);
        System.out.println("students = " + students[4]);
    }
}
