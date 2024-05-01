package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;                        //**null은 참조할 대상(주소)이 없다는 뜻이다.
        System.out.println("data = " + data);
        data = new Data();
        System.out.println("data = " + data);
        data = null;
        System.out.println("data = " + data);
    }
}

//GC - 아무도 참조하지 않는 인스턴스의 최후
//C와 같은 과거 프로그래밍언어에서는 직접 명령어를 사용해서 인스턴스를 메모리에서 제거해야했음
//자바에서는 이런 과정을 자동으로 처리해준다. 아무도 참조하지 않는 인스턴스가 있으면 JVM의 GC(가비지 컬렉션)가 더 이상 사용하지 않는 인스턴스라 판단하고 해당 인스턴스를 자동으로 메모리에서 제거해준다.
