package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println(Data3.count);    //정적 변수에 접근하는 방식이 클래스에 직접 접근하는 방식처럼 되어있다. 왜냐하면 static 변수는 메서드 영역에 저장되어 있기 떄문에

        Data3 data2 = new Data3("B");
        System.out.println(Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println(Data3.count);

        //추가
        //인스턴트를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); //권장 X : 인스턴스 변수인지, 클래스 변수인지 오해의 소지가 있기 떄문에

        //클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
