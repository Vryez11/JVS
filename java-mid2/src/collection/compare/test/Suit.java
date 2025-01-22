package collection.compare.test;

public enum Suit {
    SPADE("♠"),   //스페이드
    HEART("♥"),   //하트
    DIAMOND("♦"),  //다이아몬드
    CLUB("♣");    //클로브

    //ENUM ordinal 로 Comparable 구현을 해놨다.

    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
