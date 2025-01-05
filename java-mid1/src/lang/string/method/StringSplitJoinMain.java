package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        String[] splitStr = str.split(",");
        for (String string : splitStr) {
            System.out.println(string);
        }

        String joinStr = "";
        for (String string : splitStr) {
            joinStr += string + "-";
        }

        System.out.println("joinStr: " + joinStr);

        String joinedStr = String.join("-", splitStr);
        System.out.println("joinedStr = " + joinedStr);
    }
}
