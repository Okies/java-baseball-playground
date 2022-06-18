package wordle;

public class Wordle {

    private WordleNumber wordleNumber = new WordleNumber();
    private int strike = 0;
    private int ball = 0;

    public void setAnswer(WordleNumber wordleNumber) {
        this.wordleNumber = wordleNumber;
    }

    public void resetStatus() {
        strike = 0;
        ball = 0;
    }

    public boolean guess(String number) {

        String answer = wordleNumber.toString();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == answer.charAt(i)) {
                strike++;
            } else if (answer.contains(number.substring(i, i + 1))) {
                ball++;
            }
        }

        return strike == 3;
    }

    public void generateNumber() {
        wordleNumber.generateNumber();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (ball > 0)
            sb.append(ball).append("볼").append(" ");
        if (strike > 0)
            sb.append(strike).append("스트라이크");

        return sb.toString();
    }

    public WordleNumber getWordleNumber() {
        return this.wordleNumber;
    }
}
