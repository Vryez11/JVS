package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    //불변 객체의 값을 변경할 때에는 객체를 새로 생성해서 반환
    public ImmutableObj add(int addValue) {
        return new ImmutableObj(this.value + addValue);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableObj{" +
                "value=" + value +
                '}';
    }
}
