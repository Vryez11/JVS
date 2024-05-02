package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
            AccessData data = new AccessData();

            data.publicField = 1
            ;data.publicMethod();

            //default 다른 패키지 호출 불가
            //data.defaultField = 2;
            //data.defaultMethod();

            //private 접근 제어자 여서 호출 불가
            //data.privateField = 3;
            //data.privateMethod();

            data.innerAccess();
    }
}
