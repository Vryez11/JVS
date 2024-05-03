package static1;

public class Data3 {
    public String name;
    public static int count; //static (스태틱 변수, 정적 변수, 클래스 변수)

    public Data3(String name) { // name, 과 count 는 모두 맴버 변수(필드)
        this.name = name; //인스턴스 변수 : 인스턴스가 만들어질 때 마다 생성되는 변수
        count++; //클래스 변수 : 클래스 변수 , static 변수 , 정적 변수라고 불린다. 클래스 변수는 자바 프로그램 실행 시 딱 한번 만들어진다.
    }
}
