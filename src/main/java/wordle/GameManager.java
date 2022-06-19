package wordle;

public class GameManager {

    private final Wordle wordle = new Wordle();

    public void wordleStart() {

        boolean isCorrect = false;

        wordle.generateNumber();
        ResultView.append(wordle.getWordleNumber().toString()).print();
        while(!isCorrect) {

            wordle.resetStatus();
            ResultView.append(Sentence.NEXTWORDLE.getSentence()).print();
            String number = InputView.getWordle();

            isCorrect = wordle.guess(number);

            ResultView.append(wordle.toString()).print();
        }
        ResultView.append(Sentence.CORRECT.getSentence()).print();
    }

    public boolean wordleReStart() {
        ResultView.append(Sentence.RESTART.getSentence()).print();
        return InputView.nextInt() != 1;
    }

    public static void main(String[] args) {

        GameManager gameManager = new GameManager();

        boolean isEnd = false;

        while(!isEnd) {
            gameManager.wordleStart();

            isEnd = gameManager.wordleReStart();
        }
    }
}
