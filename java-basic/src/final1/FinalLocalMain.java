package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        //final 변수 1
        final int data1;
        data1 = 10; //final 변수는 최초 한번만 할당 가능

        //data1 = 20;


        //final 변수 2
        final int data2 = 20;
    }

    static void method(final int parameter){
        //parameter = 20;                  //컴파일오류
    }
}
