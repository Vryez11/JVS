package collection.compare;

import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {
        MyUser user1 = new MyUser("지원", 27);
        MyUser user2 = new MyUser("혜원", 30);
        MyUser user3 = new MyUser("상규", 29);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(user1);
        treeSet1.add(user2);
        treeSet1.add(user3);
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet1);

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(user1);
        treeSet2.add(user2);
        treeSet2.add(user3);
        System.out.println("IdComparator 정렬");
        System.out.println(treeSet2);
    }
}
