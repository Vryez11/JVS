package lang.string.builder;

public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String methodchainingStr = sb.append("A").append("B").append("C").append("D")
                .insert(4, "Java")
                .delete(4, 8)
                .reverse()
                .toString();

        System.out.println(methodchainingStr);

        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("Insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        //StringBuilder -> String
        String string = String.valueOf(sb);
        String string2 = sb.toString();
        System.out.println("string = " + string);
        System.out.println("string2 = " + string2);
    }
}
