package access;

//private : 모든 외부 호출을 막는다.
//default(package-private) : 같은 페키지안에서 호출은 허용한다.
//protected : 같은 페키지아넹서 호출은 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다.
//public : 모든 외부 호출을 허용한다.

public class Speaker {

    //private 접근 제어자는 모든 외부 호출을 막는다. 따라서 private이 붙는 경우 해당 클래스 내부에서만 호출할 수 있다.
    private int volume;



    //생성자
    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("volume = " + volume);
    }
}
