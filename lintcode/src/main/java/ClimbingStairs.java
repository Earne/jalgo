/**
 * 爬楼梯
 * 假设你正在爬楼梯，需要n步你才能到达顶部。但每次你只能爬一步或者两步，你能有多少种不同的方法爬到楼顶部？
 * 样例
 * <p/>
 * 比如n=3，1+1+1=1+2=2+1=3，共有3中不同的方法
 * <p/>
 * 返回 3
 */
public class ClimbingStairs {
    /**
     * @param n: An integer
     * @return res: An integer
     */
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int p = 1, q = 2, res = 0;
        for (int i = 3; i <= n; i++) {
            res = p + q;
            p = q;
            q = res;
        }
        return res;
    }
}
