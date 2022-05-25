package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperatorTest {

    @Test
    public void computeTest() {
        assertEquals(Operator.PLUS.compute(1, 2), 3);
        assertEquals(Operator.MINUS.compute(9, 3), 6);
        assertEquals(Operator.MULTIPLY.compute(6, 5), 30);
        assertEquals(Operator.DIVIDE.compute(8, 4), 2);
    }
}
