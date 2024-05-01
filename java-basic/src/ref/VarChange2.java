package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA = " + dataA);
        System.out.println("dataB = " + dataB); //dataA와 dataB의 참조값은 같을 것이다.
        System.out.println("dataA.value = " + dataA.value); //10
        System.out.println("dataB.value = " + dataB.value); //10

        dataA.value = 20;
        System.out.println("dataA.value = " + dataA.value); //20
        System.out.println("dataB.value = " + dataB.value); //20

        dataB.value = 30;
        System.out.println("dataA.value = " + dataA.value); //30
        System.out.println("dataB.value = " + dataB.value); //30

        //정답! 참조값을 전달할 때에는 참조(주소)를 전달, 따라서 같은 클래스(객체)를 가리키고 있기 때문에 한 객체의 값 변하면 다른 가리키는 곳의 객체도 당연하게 변경
    }
}
