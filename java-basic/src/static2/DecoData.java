package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    //정적 메서드는 정적메서드, 정적변수만 접근 할 수 있다. (어쩌면 당연한거, 왜냐하면 정적 메서드는 인스턴스를 사용하지 않아도 사용가능한데 인스턴스 메서드는 인스턴스를
    //생성해야지 사용가능하기 때문에 에러가 뜰 수 밖에 없는 구조이다. (인스턴스 처럼 참조값의 개념이 없다.)
    public static void staticCall() {
        //instanceValue++;  //인스턴스 변수 접근 X
        //instanceMethod(); //인스턴스 메서드 접근 X

        staticValue++;  //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }
    //오버로딩
    public static void staticCall(DecoData data){
        data.instanceCall();
        data.instanceValue++;
    }
    public void instanceCall() {
        instanceValue++;  //인스턴스 변수 접근 O
        instanceMethod(); //인스턴스 메서드 접근 O

        staticValue++;  //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }
    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }

}
