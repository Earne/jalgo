/**
 * Given a string, determine if it is a palindrome,
 * considering only alphanumeric characters and ignoring cases.
 * <p>
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * <p>
 * Note:
 * Have you consider that the string might be empty?
 * This is a good question to ask during an interview.
 * <p>
 * For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null)
            return true;

        StringBuilder ns = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                ns.append(Character.toLowerCase(s.charAt(i)));
        }
        for (int i = 0; i < ns.length() / 2; i++) {
            if (ns.charAt(i) != ns.charAt(ns.length() - i - 1))
                return false;
        }
        return true;
    }

    public boolean isPalindrome2(String s) {
        if (s == null)
            return true;
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return (new StringBuilder(s).reverse()).toString().equals(s);
    }

    public boolean isPalindrome3(String s) {
        if (s == null)
            return true;
        int p = 0;
        int q = s.length() - 1;
        while (p < q) {
            while (p < s.length() && !Character.isLetterOrDigit(s.charAt(p)))
                p++;
            while (q >= 0 && !Character.isLetterOrDigit(s.charAt(q)))
                q--;
            if (p < s.length() && q > 0 && Character.toLowerCase(s.charAt(p)) != Character
                    .toLowerCase(s.charAt(q)))
                return false;
            p++;
            q--;
        }
        return true;
    }
}
