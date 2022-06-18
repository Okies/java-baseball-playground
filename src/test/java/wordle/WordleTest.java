package wordle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordleTest {

    private Wordle wordle = new Wordle();

    @Test
    public void guessTest() {
        wordle.setAnswer(new WordleNumber("123"));
        assertThat(wordle.guess("123")).isTrue();
        assertThat(wordle.guess("124")).isFalse();
    }
}
