import org.junit.jupiter.api.Test;

import java.util.List;

class PermutationTest {
    private final Permutation permutation = new Permutation();

    @Test
    void shouldFindPermutations() {
        String word = "aab";

        List<String> outcome = permutation.singlePermutations(word);
    }

}