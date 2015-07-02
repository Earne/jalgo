/**
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int p = a.length() - 1;
        int q = b.length() - 1;
        int tmp = 0;
        while (p >= 0 || q >= 0) {
            if (q < 0) {
                if (a.charAt(p) - '0' + tmp == 2) {
                    sb.insert(0, '0');
                    tmp = 1;
                } else {
                    sb.insert(0, a.charAt(p) - '0' + tmp);
                    tmp = 0;
                }
            } else if (p < 0) {
                if (b.charAt(q) - '0' + tmp == 2) {
                    sb.insert(0, '0');
                    tmp = 1;
                } else {
                    sb.insert(0, b.charAt(q) - '0' + tmp);
                    tmp = 0;
                }
            } else {
                int tmp2 = a.charAt(p) - '0' + b.charAt(q) - '0' + tmp;
                if (tmp2 == 3) {
                    sb.insert(0, '1');
                    tmp = 1;
                } else if (tmp2 == 2) {
                    sb.insert(0, '0');
                    tmp = 1;
                } else {
                    sb.insert(0, tmp2);
                    tmp = 0;
                }
            }
            p--;
            q--;
        }
        if (tmp == 1)
            sb.insert(0, '1');
        return sb.toString();
    }
}
