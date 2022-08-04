import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CamelCaseSolverTest {
    private final CamelCaseSolver solver = new CamelCaseSolver();

    @Test
    void shouldConvertCamelCase() {
        // given
        String phrase = "inCamelCase";

        // when
        String actual = solver.camelCase2(phrase);

        // then
        String expected = "in Camel Case";
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotConvertSingleWord() {
        // given
        String phrase = "interpreter";

        // when
        String actual = solver.camelCase(phrase);

        // then
        String expected = "interpreter";
        assertEquals(expected, actual);
    }

    @Test
    void shouldReplaceGivenRegex() {
        // given
        String phrase = "inCamel1ertw";

        // when
        String actual = solver.regexWithGroups(phrase);

        // then
        String expected = " 1ertw";
        assertEquals(expected, actual);
    }
}