package oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);

        //볼륨증가
        volumeUp(data);
        //볼륨증가
        volumeUp(data);
        //볼륨감소
        volumeDown(data);
        //음악 플레이어 상태
        showStatus(data);

        off(data);
    }

    //메서드 추출 (각각의 기능들은 이후에도 재사용 될 가능성이 높기 때문에 이를 추출해서 정의), 모듈화!
    //지금까지 데이터를 클래스로 묶고 메서드를 모듈화한것은 절차지향프로그래밍이다.
    //절차지향프로그래밍의 한계는 데이터와 기능이 분리되어 있다는 것이다.
    //메서드와 객체의 데이터는 긴밀한 관련이 있다. (객체의 데이터를 수정하면 아래의 메서드의 변수도 다 바꿔줘야 된다.)
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
