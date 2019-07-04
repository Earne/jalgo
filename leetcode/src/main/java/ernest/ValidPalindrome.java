package ernest;

/**
 * 125. Valid Palindrome
 * Easy
 *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 *
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        int p = 0;
        int q = s.length() - 1;

        while (p < q) {
            while (p < s.length() && !Character.isAlphabetic(s.charAt(p)) && !Character.isDigit(s.charAt(p))) {
                p++;
            }
            while (q >= 0 && !Character.isAlphabetic(s.charAt(q)) && !Character.isDigit(s.charAt(q))) {
                q--;
            }
            if (p > q) {
                return true;
            }
            if (Character.toUpperCase(s.charAt(p)) == Character.toUpperCase(s.charAt(q))) {
                p++;
                q--;
            } else {
                return false;
            }
        }
        return true;
    }
}
