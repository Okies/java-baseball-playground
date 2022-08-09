package wordle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordTest {

    Word com;

    @BeforeEach
    public void setUp() {
        com = new Word(1, 4);
    }

    @Test
    @DisplayName("스트라이크")
    public void strike() {
        Word word = new Word(1, 4);

        assertThat(com.guess(word)).isEqualTo(WordStatus.STRIKE);
    }

    @Test
    @DisplayName("볼")
    public void ball() {
        Word word = new Word(2, 4);

        assertThat(com.guess(word)).isEqualTo(WordStatus.BALL);
    }

    @Test
    @DisplayName("낫싱")
    public void nothing() {
        Word word = new Word(2, 5);

        assertThat(com.guess(word)).isEqualTo(WordStatus.NOTHING);
    }
}
