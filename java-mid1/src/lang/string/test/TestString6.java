package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa hello";
        String key = "hello";

        int count = 0;
        int keyIndex = 0;

        while (str.indexOf(key, keyIndex) != -1) {
            keyIndex += str.substring(keyIndex).indexOf(key) + 1;
            count++;
        }

        System.out.println("count = " + count);
    }
}
