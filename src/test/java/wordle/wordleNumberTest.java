package wordle;

import org.junit.jupiter.api.Test;

public class wordleNumberTest {

    private WordleNumber wordleNumber = new WordleNumber();

    @Test
    public void generateNumberTest() {
        wordleNumber.generateNumber();
        System.out.println(wordleNumber.toString());
    }
}
