import java.util.Scanner;

/**
 * Created by Earne on 2015/9/12.
 * 11 4 2
 * 2 2 0 7 3 2 2 4 9 1 4
 * <p/>
 * 为什么是6
 * 为什么是6
 * 难道要算排列组合么？
 * 乘以c个数的排列数？
 */
public class Baidu_B {
    public static void main(String[] args) {
        int res = 0;
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int t = cin.nextInt();
        int c = cin.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }

        int[] H = new int[n];

        for (int i = c - 1; i < n; i++) {
            for (int j = 0; j < c; j++) {
                H[i] += arr[i - j];
            }
            if (H[i] > t)
                H[i] = -1;
        }

        for (int i = c - 1; i < n; i++) {
            if (H[i] != -1)
                res++;
        }
        System.out.println(res);
    }
}
