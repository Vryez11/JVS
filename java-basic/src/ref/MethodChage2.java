package ref;

public class MethodChage2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("dataA.value = " + dataA.value); //예상 : 10
        System.out.println("dataA = " + dataA);
        changeReference(dataA);
        System.out.println("dataA.value = " + dataA.value); //예상 : 20
    }

    public static void changeReference(Data dataB) {
        dataB.value = 20;
        System.out.println("dataB = " + dataB);
    }
}

//자바 대원칙!
//자바는 변수를 대입할 떄 값을 복사해서 대입한다!