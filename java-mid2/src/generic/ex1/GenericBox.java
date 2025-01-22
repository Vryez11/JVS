package generic.ex1;

public class GenericBox<T> {
    // <>를 사용한 클래스를 제네릭 클래스라 한다. 이 기호(<>)를 보통 다이아몬드라고 한다.
    // T를 타입 매개변수라 한다.

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
