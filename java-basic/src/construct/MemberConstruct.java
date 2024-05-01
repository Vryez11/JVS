package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자 : 생성자의 이름은 클래스의 이름과 같아야 한다.
    //생성자 : 생성자는 반환 타입이 없다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //생성자도 오버로딩이 가능하다!
    MemberConstruct(String name, int age) {
        this(name, age, 0); //변경, 생성자안에서만 쓸 수 있다. this()라는 기능을 사용하면 생성자 내부에서 생성자를 호출할 수 있다. this는 인스턴스 자신의 참조값을 가리킨다.
                                  //this()를 사용하면 생성자 내에서 다른 생성자를 호출할 수 있다.
                                  //this() 규칙 : 생성자 코드의 첫줄에만 작성할 수 있다.
    }
}
