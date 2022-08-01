import org.junit.Test;

import static org.junit.Assert.*;

public class SillyAddingTest {
    private final SillyAdding sillyAdding = new SillyAdding();

    @Test
    public void shouldCalculate() {
        int first = 19;
        int second = 3235;

        int result = sillyAdding.add(first, second);

        int expected = 32414;
        assertEquals(expected, result);
    }

    @Test
    public void shouldCalculateFourDigits() {
        int first = 122;
        int second = 81;

        int result = sillyAdding.add(first, second);

        int expected = 1103;
        assertEquals(expected, result);
    }

    @Test
    public void shouldCalculateForSameNumberOfDigits() {
        int first = 19;
        int second = 11;

        int result = sillyAdding.add(first, second);

        String s = "abcde";
        String current = s.substring(2, 2 + 1);
        String rest = s.substring(0, 2) + s.substring(2);
        int expected = 210;
        assertEquals(expected, result);

    }
}