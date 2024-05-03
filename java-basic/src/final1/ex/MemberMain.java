package final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("Git", "LEE");
        member.print();
        member.changeData("GIT", "KIM");
        member.print();
    }
}
