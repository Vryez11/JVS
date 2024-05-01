package method;

//오버로딩 규칙 : 메서드의 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩을 할 수 있다.(매개변수의 타입이나 숫자가 달라야함!), 매개변수가 같고 반환 타입이 다르면 오버로딩 실패!
//메서드 시그니쳐 : 메서드 이름 + 매개변수 타입이고 이는 메서드를 구분할 수 있는 고유한 식별자나 서명을 뜻한다.

public class Overloading1 {

    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1,2, 3));
    }

    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c){
        System.out.println("2번 호출");
        return  a + b + c;
    }
}
