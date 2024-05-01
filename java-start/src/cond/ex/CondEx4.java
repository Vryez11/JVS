package cond.ex;

public class CondEx4 {

    public static void main(String[] args) {
        double rating = 9;

        /*
        if (rating > 9) {
            System.out.println("추천할 영화가 없습니다");
        }   else if (rating > 8) {
            System.out.println("'어바웃 타임'을 추천합니다");
        }   else if (rating > 7) {
            System.out.println("'어바웃 타임'을 추천합니다");
            System.out.println("'토이 스토리'를 추천합니다");
        }   else {
            System.out.println("'어바웃 타임'을 추천합니다");
            System.out.println("'토이 스토리'를 추천합니다");
            System.out.println("'고질라'를 추천합니다");
        }
         */

        if (rating <=9) System.out.println("'어바웃 타임'을 추천합니다.");
        if (rating <=8) System.out.println("'토이 스토리'를 추천합니다.");
        if (rating <=7) System.out.println("'고질라'를 추천합니다.");
        //독립적인 if 를 사용하여 더욱 쉽게 추천할 수 있다! 유연한 생각 잘하기!!
    }
}
