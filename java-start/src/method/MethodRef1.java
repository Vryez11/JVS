package method;

public class MethodRef1 {

    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);

        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);
    }

    //메서드 (자바에서는 함수를 매서드라고 정의!)
    public static int add(int a, int b) { //메서드 선언 public -> 다른 클래스에서 호출 가능, static -> 객체를 생성하지 않고 호출할 수 있는 정적 메서드!
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
