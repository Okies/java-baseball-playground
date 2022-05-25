package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private CalCulator calCulator;

    @BeforeEach
    public void createCalculator() {
        calCulator = new CalCulator();
    }

    @ParameterizedTest
    @CsvSource(value = {"1 + 2:3", "2 * 4:8", "4 / 2:2", "6 - 5:1", "2 + 3 * 4 / 2:10"}, delimiter = ':')
    public void calculateTest(String expr, String expected) {
        assertEquals(calCulator.calculate(expr), Double.parseDouble(expected));
    }
}
