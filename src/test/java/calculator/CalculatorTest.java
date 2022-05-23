package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
    @CsvSource(value = {"1 + 2:True", "2 * 4 + 2:True", "4 / 2:True", "6 - 5:True", "+ 1 +:False", "a + 6:False", "5 + *:False"}, delimiter = ':')
    public void validTest(String expr, String expected) {
        assertEquals(calCulator.valid(expr), Boolean.parseBoolean(expected));
    }

    @Test
    public void partCalculateTest() {
        assertEquals(calCulator.partCalculate(1, 2, "+"), 3);
        assertEquals(calCulator.partCalculate(7, 1, "-"), 6);
        assertEquals(calCulator.partCalculate(6, 5, "*"), 30);
        assertEquals(calCulator.partCalculate(8, 2, "/"), 4);
    }

    @ParameterizedTest
    @CsvSource(value = {"1 + 2:3", "2 * 4:8", "4 / 2:2", "6 - 5:1", "2 + 3 * 4 / 2:10"}, delimiter = ':')
    public void calculateTest(String expr, String expected) {
        assertEquals(calCulator.calculate(expr), Double.parseDouble(expected));
    }
}
