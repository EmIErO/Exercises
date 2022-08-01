import org.junit.Test;

import static org.junit.Assert.*;

public class SquareNumCalculatorTest {
    private final SquareNumCalculator calculator = new SquareNumCalculator();

    @Test
    public void shouldCalc() {
        int input = 3;

        long output = calculator.solve(3);

        assertEquals(output, 1);
    }

}