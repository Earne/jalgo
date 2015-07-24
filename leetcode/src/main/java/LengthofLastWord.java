/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * <p>
 * For example,
 * Given s = "Hello World",
 * return 5.
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        int result = 0;
        int p = s.length() - 1;
        while (p >= 0 && !Character.isLetter(s.charAt(p)))
            p--;
        while (p >= 0 && Character.isLetter(s.charAt(p))) {
            p--;
            result++;
        }
        return result;
    }

    public int lengthOfLastWord2(String s) {
        if (s == null)
            return 0;
        int p = -1, q = -1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                if (q < i - 1)
                    p = i - 1;
                q = i;
            }
        }
        return q - p;
    }

    public int lengthOfLastWord3(String s) {
        String[] arr = s.trim().split(" ");
        return arr[arr.length - 1].length();
    }
}
