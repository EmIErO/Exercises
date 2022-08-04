import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculateDiagonalTest {
    private final CalculateDiagonal calculateDiagonal = new CalculateDiagonal();

    @Test
    void shouldCalculateDiagonal() {
        double expected = calculateDiagonal.execute(1, 1);
        assertEquals(expected, 1.4142, 1);
    }

}