package static2;

import static static2.DecoData.*;
import static static2.DecoData.staticCall; //이렇게 하면 DecoData.staticCall() -> staticCall(); 로 줄어든다!
//static2(패키지명).DecoData(클래스).staticCall(정적메서드)

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적호출");
        staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();

        System.out.println("2. 인스턴트호출");
        DecoData data = new DecoData();
        data.instanceCall();

        System.out.println("3. 인스턴트호출2");
        DecoData data1 = new DecoData();
        data1.instanceCall();
        data1.instanceCall();
        data1.instanceCall();
        data1.instanceCall();
    }
}
