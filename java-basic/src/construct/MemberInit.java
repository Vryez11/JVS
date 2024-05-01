package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가, 초기값을 변경하는 메서드
    void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    //this : 자기 자신의 인스턴스를 가리킴
    //맴버변수와 메서드의 매개변수의 이름이 같으면 둘을 어떻게 구분해야 할까?
    //위의 경우에는 변수보다 매개변수가 코드 블럭의 더 안쪽에 있기 때문에 매개변수가 우선순위를 가진다. 따라서 initMember메서드 안에 name을 적으면 매개변수에 접근한다.
    //맴버변수에 접근하면 앞에 this. 이라고 해주면 된다. 여기서 this는 인스턴스의 참조값을 가리킨다.
    //여기서 궁금증 : 매개변수의 name을 name1로 바꿔주면 어떻게 될까? -> this를 안쒀도 인스턴스의 name에 접근한다!
}
