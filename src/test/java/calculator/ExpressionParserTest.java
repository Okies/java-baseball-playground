package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressionParserTest {

    private ExpressionParser expressionParser;

    @BeforeEach
    public void createExpressionParser() {
        expressionParser = new ExpressionParser();
    }

    @ParameterizedTest
    @CsvSource(value = {"1 + 2:True", "2 * 4 + 2:True", "40 / 20:True", "6 - 5:True", "+ 1 +:False", "a + 6:False", "5 + *:False"}, delimiter = ':')
    public void validTest(String expr, String expected) {
        assertEquals(expressionParser.valid(expr), Boolean.parseBoolean(expected));
    }
}
