package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        //검증로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }

        //실행로직
        count++;

        //여러 개의 검증로직이 있으면 위와 같은 방법이 명확하게 나타낼 수 있다.
    }

    public int getCount() {
        return count;
    }
}
