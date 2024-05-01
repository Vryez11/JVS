package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        //전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; //a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        //후위 증감 연산자 사용 예
        a = 1;
        b = 0;

        b = a++; //a의 값을 대입하고, a의 값을 증가
        System.out.println("a = " + a + ", b = " + b);

        //System.out.println(++a) 와 System.out.println(a++)의 출력 값은 다르다. 하지만 마지막에 a의 저장값은 값다.
    }
}
