package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        data.defaultField = 2;
        data.defaultMethod();

        //private 접근 제어자 여서 호출 불가
        //data.privateField = 3;
        //data.privateMethod();

        data.innerAccess();
    }
}
