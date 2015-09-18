import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Earne on 2015/9/16.
 * 7 15
 * 15 5 3 7 9 14 0
 * <p/>
 * 1 5
 * 2
 * <p/>
 * 1 5
 * 4
 */
public class NetEase_A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int l = cin.nextInt();
        int[] arr = new int[n + 2];
        arr[0] = 0;
        arr[n + 1] = l;
        for (int i = 0; i < n; i++) {
            arr[i + 1] = cin.nextInt();
        }
        Arrays.sort(arr);
        if (arr[n] != l)
            arr[n + 1] = l + (l - arr[n]);

        if (arr[1] != 0)
            arr[0] = -arr[1];

        int help = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            help = Math.max(help, arr[i + 1] - arr[i]);
        }
        System.out.printf("%.2f", (double) help / 2);
    }
}
