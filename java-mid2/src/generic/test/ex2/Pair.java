package generic.test.ex2;

public class Pair<F, S> {

    private F first;
    private S second;

    public void setFirst(F data) {
        this.first = data;
    }

    public void setSecond(S data) {
        this.second = data;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
