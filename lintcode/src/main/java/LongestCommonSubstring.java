/**
 * 最长公共子串
 * 给出两个字符串，找到最长公共子串，并返回其长度。
 * <p/>
 * 样例
 * <p/>
 * 给出A=“ABCD”，B=“CBCE”，返回 2
 * 注意
 * <p/>
 * 子串的字符应该连续的出现在原字符串中，这与子序列有所不同。
 */
public class LongestCommonSubstring {
    /**
     * @param A, B: Two string.
     * @return res: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        int res = 0;
        int nA = A.length();
        int nB = B.length();
        if (nA == 0 || nB == 0)
            return 0;
        int[][] table = new int[nB][nA];

        for (int i = 0; i < nA; i++)
            table[0][i] = B.charAt(0) == A.charAt(i) ? 1 : 0;

        for (int i = 1; i < nB; i++) {
            if (B.charAt(i) == A.charAt(0))
                table[i][0] = 1;
            for (int j = 1; j < nA; j++)
                table[i][j] = (B.charAt(i) == A.charAt(j)) ? table[i - 1][j - 1] + 1 : 0;
        }

        for (int i = 0; i < nB; i++) {
            for (int j = 0; j < nA; j++) {
                res = Math.max(res, table[i][j]);
            }
        }

        return res;
    }
}
