import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromesTest {
    private final Palindromes palindromes = new Palindromes();

    @Test
    public void shouldFindLongestPalindrome() {
        String phrase = "asdfgvcvcxz";
        int outcome = palindromes.longestPalindrome(phrase);

        assertEquals(3, outcome);
    }

}