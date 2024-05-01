package operator;

public class Comp2 {

    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello");
        boolean result2 = str1.equals("문자열1");
        boolean result3 = str1.equals(str2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        //Ctrl + Shift + Enter : 자동으로 줄을 완성시켜준다. (; 포함)
        //Ctrl + D : 현재 줄을 복사하여 아래에 붙여넣기
    }
}
