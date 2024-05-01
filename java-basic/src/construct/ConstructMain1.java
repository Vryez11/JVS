package construct;


public class ConstructMain1 {
    public static void main(String[] args) {
        //Ctrl + p : 매개변수의 타입을 볼 떄 유용하다.
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90); //new MemberConstruct : 생성자 생성!
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);
        //new 키워드를 사용해서 객체를 생성할 때 마지막에 괄호()도 포함해야 하는 이유가 바로 생성자 때문이다.
        //생성자 장점
        //1. 중복 호출 제거
        //2. 제약을 통한 생성자 생성을 필수로 하기 떄문에 실수로 깜박할 일이 없어 진다. (컴파일 오류를 통해)
        //3. 생성자를 사용하면 필수값 입력을 보장할 수 있다.

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }
    }
}
