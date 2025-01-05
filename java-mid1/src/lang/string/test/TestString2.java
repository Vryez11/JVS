package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int lengthSum = 0;
        for (String str : arr) {
            lengthSum += str.length();
        }
        System.out.println("lengthSum = " + lengthSum);
    }
}
