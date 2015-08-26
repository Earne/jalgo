/**
 * 斐波纳契数列
 * 查找斐波纳契数列中第 N 个数。
 * <p/>
 * 所谓的斐波纳契数列是指：
 * <p/>
 * 前2个数是 0 和 1 。
 * 第 i 个数是第 i-1 个数和第i-2 个数的和。
 * <p/>
 * 斐波纳契数列的前10个数字是：
 * <p/>
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
 * 样例
 * <p/>
 * 给定 1，返回 0
 * <p/>
 * 给定 2，返回 1
 * <p/>
 * 给定 10，返回 34
 */
public class Fibonacci {
    /**
     * @param n: an integer
     * @return res: an integer f(n)
     */
    public int fibonacci(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        int p = 0, q = 1;
        for (int i = 3; i <= n; i++) {
            int tmp = q;
            q = p + q;
            p = tmp;
        }
        return q;
    }
}
