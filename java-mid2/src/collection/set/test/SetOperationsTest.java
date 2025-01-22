package collection.set.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetOperationsTest {

    public static void main(String[] args) {
        Integer[] input1 = {1, 2, 3, 4, 5};
        Integer[] input2 = {3, 4, 5, 6, 7};

        Set<Integer> union = new TreeSet<>(List.of(input1));
        union.addAll(List.of(input2));
        System.out.println("합집합: " + union);

        Set<Integer> intersection = new TreeSet<>(List.of(input1));
        intersection.retainAll(List.of(input2));
        System.out.println("교집합: " + intersection);

        Set<Integer> difference = new TreeSet<>(List.of(input1));
        difference.removeAll(List.of(input2));
        System.out.println("차집합: " + difference);
    }
}
