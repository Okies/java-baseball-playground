package wordle;

public enum WordStatus {

    STRIKE, BALL, NOTHING;

    public boolean isNotMatching() {
        return this != NOTHING;
    }

    public boolean isStrike() {
        return this == STRIKE;
    }

    public boolean isBall() {
        return this == BALL;
    }
}
