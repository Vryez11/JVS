package pack;

//import pack.a.User;
//import pack.a.User2;

import pack.a.*;

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        //임포트로 쓸 것을 미리 예고해서 클래스 명으로만 사용가능
        User user = new User();
        User2 user2 = new User2();
        //같은 패키지 안에 있는 것을 여러 개 사용할 때 * 사용가능
    }
}
