package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNameTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        /*
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = List.of(1, 2, 3);
         */

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
