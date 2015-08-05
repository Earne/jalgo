import java.util.HashMap;

/**
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * <p/>
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * <p/>
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */
public class ValidAnagram {
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] charNums = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charNums[s.charAt(i) - 'a']++;
            charNums[t.charAt(i) - 'a']--;
        }

        for (int c : charNums)
            if (c != 0)
                return false;
        return true;
    }

    // HashMap solution
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> charNums = new HashMap<>(26);
        for (int i = 0; i < s.length(); i++) {
            if (charNums.containsKey(s.charAt(i)))
                charNums.put(s.charAt(i), charNums.get(s.charAt(i)) + 1);
            else
                charNums.put(s.charAt(i), 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (!charNums.containsKey(t.charAt(i)))
                return false;
            else
                charNums.put(t.charAt(i), charNums.get(t.charAt(i)) - 1);
        }

        for (Integer i : charNums.values())
            if (i != 0)
                return false;
        return true;
    }
}
