package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    public void split1() {
        String[] values = "1,2".split(",");
        assertThat(values).contains("1").contains("2");
    }

    @Test
    public void split2() {
        String[] values = "1".split(",");
        assertThat(values).contains("1");
    }

    @Test
    public void subString() {
        String s = "(1,2)".substring(1,4);
        assertThat(s).contains("1,2");
    }

    @Test
    public void charAt() {

        //char c = "abc".charAt(5);
        assertThatThrownBy(() -> {
            char c = "abc".charAt(5);
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }
}
