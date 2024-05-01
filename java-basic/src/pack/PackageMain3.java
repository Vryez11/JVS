package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        //자주 사용하는 패키지를 임포트하고 나머지 한 개는 전체 경로로 사용
        User user = new User();
        //다른 패키지에 같은 이름의 패키지를 사용할 떄에는 최소 1개는 전체 경로로 사용해야 한다.
        pack.b.User user2 = new pack.b.User();
    }
}
