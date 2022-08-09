package wordle;

public class GuessResult {
    private int strike;
    private int ball;

    public int getStrike() {
        return this.strike;
    }

    public int getBall() {
        return this.ball;
    }

    public void report(WordStatus wordStatus) {
        if(wordStatus.isStrike())
            this.strike++;
        if(wordStatus.isBall())
            this.ball++;
    }
}
