/**
 * 字符串查找
 * 字符串查找（又称查找子字符串），是字符串操作中一个很有用的函数。你的任务是实现这个函数。
 * <p/>
 * 对于一个给定的 source 字符串和一个 target 字符串
 * 你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)。
 * <p/>
 * 如果不存在，则返回 -1。
 * <p/>
 * 样例
 * <p/>
 * 如果 source = "source" 和 target = "target"，返回 -1。
 * <p/>
 * 如果 source = "abcdabcdefg" 和 target = "bcd"，返回 1。
 * 挑战
 * <p/>
 * O(n2)的算法是可以接受的。如果你能用O(n)的算法做出来那更加好。（提示：KMP）
 * 说明
 * <p/>
 * 在面试中我是否需要实现KMP算法？
 * <p/>
 * 不需要，当这种问题出现在面试中时，面试官很可能只是想要测试一下你的基础应用能力。
 * 当然你需要先跟面试官确认清楚要怎么实现这个题。
 */
public class Strstr {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     *
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        if (source == null || target == null)
            return -1;
        if (target.length() == 0)
            return 0;
        for (int i = 0; i < source.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < target.length(); j++) {
                if (target.charAt(j) != source.charAt(i + j)) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                return i;
        }
        return -1;
    }
}
