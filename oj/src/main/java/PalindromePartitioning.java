import java.util.ArrayList;
import java.util.List;

/**
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * <p>
 * Return all possible palindrome partitioning of s.
 * <p>
 * For example, given s = "aab",
 * Return
 * <p>
 * [
 * ["aa","b"],
 * ["a","a","b"]
 * ]
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        if (s.length() == 0)
            return res;
        helper(res, s, 0, new ArrayList<String>());
        return res;
    }

    private void helper(List<List<String>> res, String s, int beg, List<String> cur) {
        if (beg == s.length())
            res.add(new ArrayList<String>(cur));
        for (int end = beg + 1; end <= s.length(); end++) {
            if (!isValied(s.substring(beg, end)))
                continue;
            cur.add(s.substring(beg, end));
            helper(res, s, end, cur);
            cur.remove(cur.size() - 1);
        }
    }

    private boolean isValied(String substring) {
        for (int i = 0; i < substring.length() / 2; i++) {
            if (substring.charAt(i) != substring.charAt(substring.length() - 1 - i))
                return false;
        }
        return true;
    }
}
