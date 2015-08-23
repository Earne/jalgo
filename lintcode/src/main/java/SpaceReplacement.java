/**
 * 空格替换
 * 设计一种方法，将一个字符串中的所有空格替换成 %20 。你可以假设该字符串有足够的空间来加入新的字符，且你得到的是“真实的”字符长度。
 * <p/>
 * 样例
 * <p/>
 * 对于字符串"Mr John Smith", 长度为 13
 * <p/>
 * 替换空格之后的结果为"Mr%20John%20Smith"
 * 注意
 * <p/>
 * 如果使用 Java 或 Python, 程序中请用字符数组表示字符串。
 * 挑战
 * <p/>
 * 在原字符串(字符数组)中完成替换，不适用额外空间
 */
public class SpaceReplacement {
    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return res: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        if (string == null)
            return 0;
        int res = length;
        for (char c : string) {
            if (c == ' ')
                res += 2;
        }
        int p = length - 1;
        int q = res - 1;
        while (p != q) {
            if (string[p] == ' ') {
                p--;
                string[q--] = '0';
                string[q--] = '2';
                string[q--] = '%';
            } else
                string[q--] = string[p--];
        }
        return res;
    }
}
