import java.util.Scanner;

/**
 * Created by Earne on 2015/9/12.
 * <p/>
 * // 7 1 3
 * // 2 10 7 18 5 33 0
 * 7 1 3
 * 2 10 7 18 5 33 0
 */
public class Baidu_C {
    public static void main(String[] args) {
        int res = 0;
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int k = cin.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }

        for (int i = 0; i < k; i++) {
            int[] H = new int[n];
            for (int j = m - 1; j < n; j++) {
                for (int l = j; l >= j - m + 1; l--) {
                    if (arr[l] == -1) {
                        H[j] = 0;
                        break;
                    }
                    H[j] += arr[l];
                }
                if (j > 0)
                    H[j] = Math.max(H[j - 1], H[j]);
            }

            for (int j = n - 1; j > 0; j--) {
                if (H[j] > H[j - 1]) {
                    for (int l = 0; l < m; l++) {
                        res += arr[j - l];
                        arr[j - l] = -1;
                    }
                    break;
                }
            }

        }

        System.out.println(res);
    }
}
