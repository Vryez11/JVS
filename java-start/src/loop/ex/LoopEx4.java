package loop.ex;

public class LoopEx4 {

    public static void main(String[] args) {

        for (int num = 2, count = 1; count <=10; num +=2, count++){ //for문 안의 초기화, 증감식에 2개 이상의 변수 설정 가능!
            System.out.println(num);
        }
    }
}
