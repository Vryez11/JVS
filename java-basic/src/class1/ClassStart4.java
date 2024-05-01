package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 80;

        Student[] students = new Student[2]; //Student 를 담을 수 있는 배열을 생성
        students[0] = student1; //참조(주소)값 전달
        students[1] = student2; //참조(주소)값 전달

        //***자바에서 변수의 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다!!

        System.out.println(students); //students 또한 배열을 가리키는 참조(주소)값을 가지고 있음!
        for(int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
        }
    }
}
