/**
 * // 面试题5：替换空格
 * // 题目：请实现一个函数，把字符串中的每个空格替换成"%20"。例如输入“We are happy.”，
 * // 则输出“We%20are%20happy.”。
 *
 * @author gengyuanzhen
 */
public class ReplaceSpaces {
    public String trans(char[] chars) {
        int sCount = 0;
        for (char c : chars) {
            if (' ' == c) {
                sCount++;
            }
        }
        int p = chars.length - 1;
        int q = p + sCount * 2;
        char[] res = new char[q + 1];
        while (p >= 0) {
            if (chars[p] == ' ') {
                res[q--] = '0';
                res[q--] = '2';
                res[q--] = '%';
            } else {
                res[q--] = chars[p];
            }
            p--;
        }

        return new String(res);
    }
}
