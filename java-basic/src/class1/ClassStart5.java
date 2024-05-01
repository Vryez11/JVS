package class1;

import java.awt.color.ICC_ColorSpace;

public class ClassStart5 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 80;

        Student[] students = {student1, student2};

        for(int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
        }

        for(int i = 0; i < students.length; i++) {
            Student s = students[i]; //for 문을 최적화
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

        for(Student s : students) { // 이 방법을 잘 기억하자! 클래스도 결국은 변수의 타입과 비슷하다(?)
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
