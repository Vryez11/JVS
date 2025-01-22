package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        String[] stringSplit = text.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String str : stringSplit) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        System.out.println(map);
    }
}
