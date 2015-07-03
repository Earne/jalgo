/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * <p>
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * <p>
 * Given an integer n, generate the nth sequence.
 * <p>
 * Note: The sequence of integers will be represented as a string.
 */
public class CountandSay {
    public String countAndSay(int n) {
        StringBuilder pre = new StringBuilder("1");
        for (int i = 0; i < n - 1; i++) {
            StringBuilder cur = new StringBuilder();
            int cnt = 1;
            for (int j = 1; j < pre.length(); j++) {
                if (pre.charAt(j) != pre.charAt(j - 1)) {
                    cur.append(cnt);
                    cur.append(pre.charAt(j - 1));
                    cnt = 1;
                } else
                    cnt++;
            }
            cur.append(cnt);
            cur.append(pre.charAt(pre.length() - 1));
            pre = cur;
        }
        return pre.toString();
    }
}
