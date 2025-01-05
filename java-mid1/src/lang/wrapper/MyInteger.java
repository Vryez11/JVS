package lang.wrapper;

//특정 기본형을 감싸서(Wrap) 만드는 클래스를 래퍼 클래스(Wrapper Class)라고 한다.
public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value > target) return 1;
        else if (value < target) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
