package nested;

public class ShdowingMain {

    public int value = 1;

    class Inner {
        public int value = 1;

        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.valeu = " + this.value);
            System.out.println("ShdowinMain.value = " + ShdowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShdowingMain main = new ShdowingMain();
        main.new Inner().go();
    }

    //섀도잉 : 다른 변수들을 가려서 보이지 않게 하는 것
    //프로그래밍에서 가장 중요한 것은 명확성이다. 이렇게 이름이 같은 경우 처음부터 이름을 서로 다르게 지어서 명확하게 구분하는 것이 더 나은 방법이다.
}
