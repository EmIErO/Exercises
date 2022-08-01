public class Palindromes {

    public static int longestPalindrome(final String s) {
        if (s.trim().isEmpty()) return 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int length1 = expandFromCenter(s, i, i);
            int length2 = expandFromCenter(s, i, i + 1);
            int max = Math.max(length1, length2);
            if (max > end - start + 1) {    // i = 3, max = 3 -> 2 i 4, max = 4 -> 2 i 5
                start = i - (max - 1) / 2;  //
                end = i + max / 2;            //
            }
        }
        return s.substring(start, end + 1).length(); //your code here
    }

    private static int expandFromCenter(String string, int left, int right) {
        if (string == null || right < left) return 0;
        while (left >= 0 && right < string.length() && string.charAt(left) == string.charAt(right)) {
            left--;
            right++; // previous value was pointing to a palindrome
        }
        return right - left - 1;
    }
}
//
//3 -> 2 i 4 ret 4-2-1
//3 i 4 -> 4 - 3 - 1
