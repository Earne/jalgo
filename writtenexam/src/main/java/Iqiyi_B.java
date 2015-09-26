/**
 * Created by earne on 9/26/15.
 */
public class Iqiyi_B {
    public static int foo(int n) {
        int j, cur;
        int[] arr = new int[n];
        for (j = 0; j < 2; j++) {
            arr[j] = j;
        }
        for (; j < n; ++j) {
            arr[j] = j + 1;
        }

        cur = 2;
        while (--n != 0) {
            cur = (cur + 2) % n;
            for (int i = cur + 1; i < n; ++i) {
                arr[i - 1] = arr[i];
            }
        }
        return arr[0] + 1;
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = i + 1;
//        }
//        while (n-- != 0) {
//
//        }
//        return -1;
    }
}
