package wordle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class WordleTest {

    Words com;

    @BeforeEach
    public void setUp() {
        com = new Words(Arrays.asList(1, 2, 3));
    }

    @Test
    @DisplayName("3자리 수 전체 비교 낫싱")
    public void guess_nothing() {
        GuessResult guessResult = com.guess(Arrays.asList(4, 5, 6));
        assertThat(guessResult.getStrike()).isEqualTo(0);
        assertThat(guessResult.getBall()).isEqualTo(0);
    }

    @Test
    @DisplayName("3자리 수 전체 비교 1볼")
    public void guess() {
        GuessResult guessResult = com.guess(Arrays.asList(1, 4, 2));
        assertThat(guessResult.getStrike()).isEqualTo(1);
        assertThat(guessResult.getBall()).isEqualTo(1);
    }

    @Test
    @DisplayName("3자리 수 스트라이크")
    public void strike() {
        WordStatus wordStatus = com.guess(new Word(1, 1));
        assertThat(wordStatus).isEqualTo(WordStatus.STRIKE);
    }

    @Test
    @DisplayName("3자리 수 볼")
    public void ball() {
        WordStatus wordStatus = com.guess(new Word(1, 3));
        assertThat(wordStatus).isEqualTo(WordStatus.BALL);
    }

    @Test
    @DisplayName("3자리 수 낫싱")
    public void nothing() {
        WordStatus wordStatus = com.guess(new Word(1, 4));
        assertThat(wordStatus).isEqualTo(WordStatus.NOTHING);
    }
}
