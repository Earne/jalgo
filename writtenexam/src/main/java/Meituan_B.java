/**
 * 斜着打印矩阵
 */
public class Meituan_B {
    public int[] arrayPrint(int[][] arr, int n) {
        int[] res = new int[n * n];
        int cur = 0;

        for (int j = n - 1; j >= 0; j--) {
            int tmp = j;
            for (int i = 0; i < n - j; i++) {
                res[cur++] = arr[i][tmp++];
            }
        }

        for (int i = 1; i < n; i++) {
            int tmp = i;
            for (int j = 0; j < n - i; j++) {
                res[cur++] = arr[tmp++][j];
            }
        }
        return res;
    }
}
