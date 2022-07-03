package wordle;

import java.util.Objects;

public class Word {
    private final int position;
    private final int num;

    public Word(int position, int num) {
        this.position = position;
        this.num = num;
    }

    public WordStatus guess(Word word) {
        if(this.equals(word)) {
            return WordStatus.STRIKE;
        }

        if(this.matchNumber(word.num)) {
            return WordStatus.BALL;
        }

        return WordStatus.NOTHING;
    }

    private boolean matchNumber(int num) {
        return this.num == num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return position == word.position && num == word.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, num);
    }
}
