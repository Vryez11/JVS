package collection.compare;

import java.util.Arrays;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser user1 = new MyUser("지원", 27);
        MyUser user2 = new MyUser("혜원", 30);
        MyUser user3 = new MyUser("상규", 29);

        MyUser[] users = {user1, user2, user3};

        System.out.println("Comparable 기본 정렬");
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));

        //추가
        System.out.println("IdComparator 정렬");
        Arrays.sort(users, new IdComparator());
        System.out.println(Arrays.toString(users));

        Arrays.sort(users, new IdComparator().reversed());
        System.out.println(Arrays.toString(users));
    }
}
