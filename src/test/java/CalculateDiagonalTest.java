import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateDiagonalTest {
    private final CalculateDiagonal calculateDiagonal = new CalculateDiagonal();

    @Test
    public void shouldCalculateDiagonal() {
        double expected = calculateDiagonal.execute(1, 1);
        assertEquals(expected, 1.4142, 1);
    }

}