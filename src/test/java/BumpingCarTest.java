import org.junit.Test;

import static org.junit.Assert.*;

public class BumpingCarTest {
    private final BumpingCar bumpingCar = new BumpingCar();

    @Test
    public void shouldCountBumps() {
        String input = "____nn____nn";

        String output = bumpingCar.bumps(input);
        long X = Long.MAX_VALUE;
        assertEquals(output, "Whooo!");
    }
}