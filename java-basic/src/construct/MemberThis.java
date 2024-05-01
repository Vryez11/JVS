package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        this.nameField = nameParameter;
    }
    //먼저 매개변수에서 이름이 있는지 찾고, 그 다음 맴버변수에 가서 찾게 된다.
    //this와 코딩스타일 : 맴버변수를 사용할 때에는 무조건 this를 붙여 명확하게 하는 것이 좋을 수 있음!
    //IDE가 발전하면서 색상의 구분으로 딱히 필요하지 않아 권장하지 않음.
}
