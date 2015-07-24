/**
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int pre = 1, cur = 2, result = 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        for (int i = 3; i <= n; i++) {
            result = pre + cur;
            pre = cur;
            cur = result;
        }
        return result;
    }
}
