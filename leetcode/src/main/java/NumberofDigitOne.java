/**
 * Given an integer n,
 * count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
 * <p>
 * For example:
 * Given n = 13,
 * Return 6, because digit 1 occurred in the following numbers: 1, 10, 11, 12, 13.
 * <p>
 * Hint:
 * <p>
 * Beware of overflow.
 */
public class NumberofDigitOne {
    public int countDigitOne(int n) {
        int result = 0;
        for (long cur = 1; cur <= n; cur *= 10) {
            int head = n / (int) cur;
            int rear = n % (int) cur;
            int tmp = head % 10;
            if (tmp > 1)
                result += (head / 10 + 1) * cur;
            else if (tmp == 1)
                result += (head / 10) * cur + rear + 1;
            else
                result += head / 10 * cur;
        }
        return result;
    }

    // TODO refactor this
}
