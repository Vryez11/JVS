package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String, Member> members = new HashMap<>();

    public void save(Member member) {
        members.put(member.getId(), member);
    }

    public Member findById(String id) {
        return members.get(id);
    }

    public Member findByName(String name) {
        for (Member value : members.values()) {
            if (value.getName().equals(name)) {
                return value;
            }
        }
        return null;
    }

    public void remove(String id) {
        members.remove(id);
    }
}
