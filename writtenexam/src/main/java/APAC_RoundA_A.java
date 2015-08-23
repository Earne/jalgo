import java.util.Scanner;

/**
 * Created by Earne on 2015/8/23.
 */
public class APAC_RoundA_A {
    public static void main(String[] args) {
//        int j = 0;
//        for (long i = 0; i < (long) Math.pow(10, 100); i = i * 2 + 1) {
//            System.out.println(i + " :" + j++);
//        }

        long[] s = new long[100];
        int j = 0;
        for (long i = 0; i < (long) Math.pow(10, 100); i = i * 2 + 1) {
            s[j++] = i;
        }
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        for (int i = 1; i <= T; i++) {
            boolean flag = false;
            boolean fin = false;
            long K = cin.nextLong() - 1;
            while (!fin) {
                for (int k = 0; k < 100; k++) {
//                    if (K == s[k]) {
//                        fin = true;
////                        flag = false;
////                        System.out.println(0);
//                        break;
//                    }
                    if (K < s[k]) {
                        if (K == s[k - 1] ) {
                            fin = true;
//                            flag = false;
                            break;
                        }
                        K = s[k - 1] - (K - s[k - 1]);
                        flag = !flag;
                        break;
                    }
                }
            }
            if (flag)
                System.out.println("Case #" + i + ": " + 1);
            else
                System.out.println("Case #" + i + ": " +0);
        }

    }
}
