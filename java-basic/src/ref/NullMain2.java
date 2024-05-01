package ref;

public class NullMain2 {

    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //객체를 참조할 떄에는 .(dot)을 사용하는데 이렇게 참조값을 사용해서 해당 객체를 찾아 갈 수 있는데 그 참조값이 null이라면, NullPointerException 예외 발생!
        System.out.println("data.value = " + data.value);
    }
}
