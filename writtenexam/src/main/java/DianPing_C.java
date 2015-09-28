/**
 * Created by earne on 9/17/15.
 */

import java.util.Scanner;

/*求最大公约数和最小公倍数*/
public class DianPing_C {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();

        int num2 = scan.nextInt();

        System.out.println(maxCommonDivisor(num1, num2));
        System.out.println(minCommonMultiple(num1, num2));
    }

    // 递归法求最大公约数
    public static int maxCommonDivisor(int m, int n) {
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        if (m % n == 0) {
            return n;
        } else {
            return maxCommonDivisor(n, m % n);
        }
    }

    // 循环法求最大公约数
    public static int maxCommonDivisor2(int m, int n) {

        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        while (m % n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return n;
    }

    // 求最小公倍数
    public static long minCommonMultiple(int m, int n) {
        return (long) m * n / maxCommonDivisor(m, n);
    }
}