package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1 = new Student(); //new Student()가 객체, 실체를 만드는 것!, //Student student1 : Student 타입을 받을 수 있는 변수 선언!
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 80;

        //설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체(student1, student2)를 객체 또는 인스턴스라고 한다.

        System.out.println("student1 = " + student1); //student1 변수 안에는 Student 객체를 가리키(메모리)는 참조(주소)값을 저장하고 있다.
        System.out.println("student2 = " + student2);
        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);

        //객체와 인스턴스의 차이
        //객체 : 객체는 클래스에서 정의한 속성과 기능을 가진 실체
        //인스턴스 : 인스턴스는 특정 클래스로부터 생성된 객체(관계)를 의미. ex) student1 객체는 Student 클래스의 인스턴스이다.
        //student1은 객체이지만, 이 객체가 Student 클래스부터 생성된다는 점을 명확히 하기 위해 student1을 Student의 인스턴스라고 부른다.
    }
}
