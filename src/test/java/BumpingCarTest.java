import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BumpingCarTest {

    private BumpingCar bumpingCar = new BumpingCar();
    @Test
    void shouldCountBumps() {
        String input = "____nn____nn";

        String output = bumpingCar.bumps(input);
        long X = Long.MAX_VALUE;

        assertEquals(output, "Whooo!");
    }
}