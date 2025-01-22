package collection.iterable;

import java.util.*;

public class JavaIterableMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> listIter = list.iterator();

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Iterator<Integer> setIter = set.iterator();

        printAll(listIter);
        foreach(list);
        printAll(setIter);
        foreach(set);
    }

    private static <E> void foreach(Iterable<E> collection) {
        System.out.println("iterable = " + collection.getClass());
        //Iterable
        for (E i : collection) {
            System.out.println(i);
        }
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator = " + iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
