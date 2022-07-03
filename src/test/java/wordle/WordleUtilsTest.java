package wordle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordleUtilsTest {

    @Test
    @DisplayName("1~9 자리 검증")
    public void validateRange() {
        assertThat(WordleUtils.validateRange(9)).isTrue();
        assertThat(WordleUtils.validateRange(1)).isTrue();
        assertThat(WordleUtils.validateRange(0)).isFalse();
        assertThat(WordleUtils.validateRange(10)).isFalse();
    }

}
