import java.util.Scanner;

/**
 * Created by Earne on 2015/9/18.
 */
public class JD_A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int res = 0, m;
        boolean flag = false;
        for (res = n + 1; ; res += n) {
            m = res;
            for (int i = 0; i < n; i++) {
                if (m % n != 1) {
                    flag = true;
                    break;
                }
                m = m - 1 - m / n;
            }
            if (!flag && m > 0) {
                break;
            }
            flag = false;
        }

        System.out.println(res);
    }
}
