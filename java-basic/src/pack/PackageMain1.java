package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        Data data = new Data();
        //다른 패키지에 있는 클래스 사용할 때
        pack.a.User user = new pack.a.User();
    }
}
