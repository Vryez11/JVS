package enumeration.ex3;

public enum Grade {
    BASIC, GOLD, DIAMOND;

    @Override
    public String toString() {
        return "{grade = " + this.name() + "}";
    }
}
