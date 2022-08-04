import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class DictionaryTest {
    private final Dictionary dictionary = new Dictionary();

    @Test
    void shouldSortWords() {
        List<String> imput = Arrays.asList("", null, "and", "Atom", "gray", "alsa", "bump");

        Map<String, List<String>> output = dictionary.from(imput);
        System.out.printf("");
    }

}