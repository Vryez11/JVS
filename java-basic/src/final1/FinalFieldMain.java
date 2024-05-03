package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        System.out.println("생성자 초기화");

        //생성자초기화
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);

        //필드초기화
        FieldInit init1 = new FieldInit();
        FieldInit init2 = new FieldInit();
        FieldInit init3 = new FieldInit();
        FieldInit init4 = new FieldInit();

        //상수
        System.out.println(FieldInit.CONST_VALUE);
    }
}
