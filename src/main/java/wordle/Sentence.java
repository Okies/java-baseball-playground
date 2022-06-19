package wordle;

public enum Sentence {

    NEXTWORDLE("숫자를 입력해주세요"),
    CORRECT("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    private final String s;

    Sentence(String s) {
        this.s = s;
    }

    public String getSentence() {
        return s;
    }
}
