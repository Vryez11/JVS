package ref;

//멤버변수와 지역변수 : 멤버변수는 클래스 안에 있는 변수, 지역변수는 메서드 안에 있는변수
//멤버변수 -> 초기화가 자동으로 됨, 지역변수 -> 초기화 자동으로 X(직접해줘야함)

public class Method2 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생 1", 15, 90);
        Student student2 = createStudent("학생 2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    public static Student createStudent(String name, int age, int grade){
        Student student = new Student();

        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    public static void printStudent(Student student) {
        System.out.println("학생 이름: " + student.name + ", 나이: " + student.age + ", 성적: " + student.grade);
    }
}

