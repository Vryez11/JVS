package lang.immutable.address;

public class ImmutableAddress {

    private final String address;

    public ImmutableAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "address='" + address + '\'' +
                '}';
    }

    //**불변 클래스를 만드는 방법은 아주 단순하다. 어떻게든 필드 값을 변경할 수 없게 클래스를 설계하면 된다.
}
