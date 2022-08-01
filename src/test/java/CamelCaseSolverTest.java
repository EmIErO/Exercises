import org.junit.Test;

import static org.junit.Assert.*;

public class CamelCaseSolverTest {
    private final CamelCaseSolver solver = new CamelCaseSolver();

    @Test
    public void shouldConvertCamelCase() {
        // given
        String phrase = "inCamelCase";

        // when
        String actual = solver.camelCase2(phrase);

        // then
        String expected = "in Camel Case";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotConvertSingleWord() {
        // given
        String phrase = "interpreter";

        // when
        String actual = solver.camelCase(phrase);

        // then
        String expected = "interpreter";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReplaceGivenRegex() {
        // given
        String phrase = "inCamel1ertw";

        // when
        String actual = solver.regexWithGroups(phrase);

        // then
        String expected = " 1ertw";
        assertEquals(expected, actual);
    }
}