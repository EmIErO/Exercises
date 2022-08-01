import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class PermutationTest {
    private final Permutation permutation = new Permutation();

    @Test
    public void shouldFindPermutations() {
        String word = "aab";

        List<String> outcome = permutation.singlePermutations(word);
    }

}