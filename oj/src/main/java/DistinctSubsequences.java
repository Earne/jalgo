/**
 * Given a string S and a string T, count the number of distinct subsequences of T in S.
 * <p/>
 * A subsequence of a string is a new string which is formed from the original string by
 * deleting some (can be none) of the characters without disturbing the relative positions of
 * the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).
 * <p/>
 * Here is an example:
 * S = "rabbbit", T = "rabbit"
 * <p/>
 * Return 3.
 */
public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
        int[][] res = new int[t.length() + 1][s.length() + 1];
        for (int i = 0; i < s.length() + 1; i++)
            res[0][i] = 1;
        for (int i = 1; i < t.length() + 1; i++) {
            for (int j = 1; j < s.length() + 1; j++) {
                if (s.charAt(j - 1) == t.charAt(i - 1))
                    res[i][j] = res[i - 1][j - 1] + res[i][j - 1];
                else
                    res[i][j] = res[i][j - 1];
            }
        }

        return res[t.length()][s.length()];
    }

    // TODO redo this
}
