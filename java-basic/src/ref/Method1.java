package ref;

import java.util.Scanner;

public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        inputStudent(student1);
        inputStudent(student2);
    }

    public static void inputStudent(Student student){
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 이름: ");
        student.name = scanner.nextLine();
        System.out.print("학생 나이 : ");
        student.age = scanner.nextInt();
        System.out.print("학생 성적 : ");
        student.grade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("이름: " + student.name + ", 나이: " + student.age + ", 성적: " + student.grade); //출력 부분은 메서드를 하나 새로 파는 것이 보기 좋은듯!
    }
}
