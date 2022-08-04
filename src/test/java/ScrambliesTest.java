import org.junit.jupiter.api.Test;

class ScrambliesTest {
    private final Scramblies scramblies = new Scramblies();

    @Test
    void shouldCheckString() {
        boolean output = scramblies.scramble("scriptjavx","javascript");

        System.out.println(Character.getNumericValue('z'));
    }

}