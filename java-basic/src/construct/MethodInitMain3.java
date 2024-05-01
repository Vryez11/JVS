package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("학생1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("학생2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 성적: " + member.grade);
        }
    }
}
