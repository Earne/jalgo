/**
 * 二进制中有多少个1
 * 计算在一个 32 位的整数的二进制表式中有多少个 1.
 * 样例
 * <p/>
 * 给定 32 (100000)，返回 1
 * <p/>
 * 给定 5 (101)，返回 2
 * <p/>
 * 给定 1023 (111111111)，返回 10
 */
public class CountOneInBinary {
    /**
     * @param num: an integer
     * @return res: an integer, the number of ones in num
     */
    public int countOnes(int num) {
        int res = 0;
        while (num != 0) {
            num = (num - 1) & num;
            res++;
        }
        return res;
    }
}
