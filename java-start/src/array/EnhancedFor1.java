package array;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println("number = " + number);
        }

        //For-Each 문 (향상된 For문) 실무에서 많이 쓰이는 for문!
        for (int number : numbers) {
            System.out.println("number = " + number);
        }

        //쉽게 for-each문 작성하는 단축키는 iter! 기억할것
        for (int number : numbers) {
            System.out.println("iter 단축키로 만든 for-each문!");
        }
    }
}
