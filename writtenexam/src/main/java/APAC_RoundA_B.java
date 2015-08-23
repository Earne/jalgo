import java.util.Scanner;

/**
 * Created by Earne on 2015/8/23.
 */
public class APAC_RoundA_B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = cin.nextInt();
            int M = cin.nextInt();
            int[] dims = new int[N];
            for (int j = 0; j < N; j++) {
                dims[j] = cin.nextInt();
            }
            System.out.println("Case #" + i + ": ");
            while (M-- != 0) {
                double res = 1.0;
                int L = cin.nextInt();
                int R = cin.nextInt();
                for (int j = L; j <= R; j++) {
                    res *=  StrictMath.pow(dims[j], 1.0 / (R - L + 1));
                }
                System.out.println(res);
            }
        }
    }
}
