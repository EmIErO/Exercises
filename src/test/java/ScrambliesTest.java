import org.junit.Test;

import static org.junit.Assert.*;

public class ScrambliesTest {
    private final Scramblies scramblies = new Scramblies();

    @Test
    public void shouldCheckString() {
        boolean output = scramblies.scramble("scriptjavx","javascript");

        System.out.println(Character.getNumericValue('z'));
    }

}