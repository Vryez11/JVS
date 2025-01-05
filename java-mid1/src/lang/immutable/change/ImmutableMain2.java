package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj(10);

        immutableObj.add(20); //x002를 반환했지만 변수에 저장하지 않아 GC가 객체를 제거

        System.out.println("immutableObj = " + immutableObj.getValue());
    }
}
