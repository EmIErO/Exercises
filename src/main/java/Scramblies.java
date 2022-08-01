import java.util.Arrays;

public class Scramblies {

    public boolean scramble(String str1, String str2) {
        int[] letters = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            letters[str1.charAt(i) % 26]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            if (letters[str2.charAt(i) % 26] == 0) {
                return false;
            }
            letters[str2.charAt(i) % 26]--;
        }
        return true;
    }
}
