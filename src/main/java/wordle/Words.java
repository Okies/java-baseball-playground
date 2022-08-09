package wordle;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private final List<Word> words;

    public Words(List<Integer> numbers) {
        this.words = mapWord(numbers);
    }

    private List<Word> mapWord(List<Integer> numbers) {
        List<Word> words = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            words.add(new Word(i + 1, numbers.get(i)));
        }
        return words;
    }

    public WordStatus guess(Word word) {
        return words.stream()
                .map(com -> com.guess(word))
                .filter(WordStatus::isNotMatching)
                .findFirst()
                .orElse(WordStatus.NOTHING);
    }

    public GuessResult guess(List<Integer> numbers) {
        Words userWords = new Words(numbers);
        GuessResult guessResult = new GuessResult();

        for(Word word : words) {
            WordStatus wordStatus = userWords.guess(word);
            guessResult.report(wordStatus);
        }

        return guessResult;
    }
}
