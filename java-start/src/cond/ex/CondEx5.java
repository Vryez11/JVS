package cond.ex;

public class CondEx5 {

    public static void main(String[] args) {
        String grade = "A";
        String result = switch (grade){
            case "A" -> "탁원한 성과입니다.";
            case "B" -> "좋은 성과입니다.";
            case "C" -> "준수한 성과입니다.";
            case "D" -> "향상이 필요합니다.";
            case "F" -> "불합격 입니다.";
            default -> "잘못된 학점입니다.";
        };

        System.out.println(result);
    }
}
