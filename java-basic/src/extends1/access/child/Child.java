package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 1; //상속 관계 또는 같은 패키지
        //defaultValue = 1; //다른 패키지 호출 불가
        //private = 1;      //당연히 불가능

        publicMethod();
        protectedMethod();

        printParent();
    }
}
