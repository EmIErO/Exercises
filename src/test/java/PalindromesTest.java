import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromesTest {
    private final Palindromes palindromes = new Palindromes();

    @Test
    void shouldFindLongestPalindrome() {
        String phrase = "asdfgvcvcxz";
        int outcome = palindromes.longestPalindrome(phrase);

        assertEquals(3, outcome);
    }

}