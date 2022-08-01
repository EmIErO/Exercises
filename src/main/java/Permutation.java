import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutation {

    public List<String> singlePermutations(String s) {
        Set<String> permutations = new HashSet<>();
        permutate(s, "", permutations);
        return new ArrayList<>(permutations);
    }
    private void permutate(String letters, String perm, Set<String> permutations) {
        if (letters.length() == 0) {
            permutations.add(perm);
            return;
        }
        for (int i = 0; i < letters.length(); i++) {
            char current = letters.charAt(i);
            String rest = letters.substring(0, i) + letters.substring(i + 1);
            permutate(rest, perm + current, permutations);
        }
    }
}
