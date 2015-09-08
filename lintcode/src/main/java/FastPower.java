/**
 * 快速幂
 * 计算a^n % b，其中a，b和n都是32位的整数。
 * 样例
 * <p/>
 * 例如 231 % 3 = 2
 * <p/>
 * 例如 1001000 % 1000 = 0
 * 挑战
 * <p/>
 * O(logn)
 */
public class FastPower {
    /**
     * @param a, b, n: 32bit integers
     * @return An integer
     */
    public int fastPower2(int a, int b, int n) {
        long la = a;
        long res = 1;
        if (n == 0)
            return 1 % b;
//        if (n < 0) {
//            a = 1 / a;
//            n = -n;
//        }
        while (n > 0) {
            if (n % 2 == 0) {
                la = (la * la) % b;
                n = n / 2;
            } else {
                res = res * la % b;
                n = n - 1;
            }

        }
        return (int) res;
    }

    // recursive solution
    public int fastPower(int a, int b, int n) {
        if (n == 0)
            return 1 % b;
        if (n < 0) {
            a = 1 / a;
            n = -n;
        }
        long res = fastPower(a, b, n / 2);
        res = res * res % b;
        if (n % 2 == 1) {
            res = res * a % b;
        }

        return (int) res;
    }
}
