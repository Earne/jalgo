/**
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

 For example,
 Given n = 3,
 You should return the following matrix:

 [
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
 ]

 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int i = 0, j = 0, dir = 1;
        for (int cur = 1; cur <= n * n; cur++) {
            if (dir == 1) {
                if (j < n && result[i][j] == 0)
                    result[i][j++] = cur;
                else {
                    dir = 2;
                    result[++i][--j] = cur;
                    i++;
                }
                continue;
            }

            if (dir == 2) {
                if (i < n && result[i][j] == 0)
                    result[i++][j] = cur;
                else {
                    dir = 3;
                    result[--i][--j] = cur;
                    j--;
                }
                continue;
            }

            if (dir == 3) {
                if (j >= 0 && result[i][j] == 0)
                    result[i][j--] = cur;
                else {
                    dir = 4;
                    result[--i][++j] = cur;
                    i--;
                }
                continue;
            }

            if (dir == 4) {
                if (i >= 0 && result[i][j] == 0) {
                    result[i--][j] = cur;
                } else {
                    dir = 1;
                    result[++i][++j] = cur;
                    j++;
                }
            }
            continue;
        }

        return result;
    }

    public int[][] generateMatrix2(int n) {
        if (n == 0)
            return new int[0][0];
        int[][] result = new int[n][n];
        int i = 0, j = 0, cur = 1;
        while (cur < n * n) {
            while (j < n - 1 && result[i][j+1] == 0)
                result[i][j++] = cur++;
            while (i < n - 1 && result[i+1][j] == 0)
                result[i++][j] = cur++;
            while (j > 0 && result[i][j-1] == 0)
                result[i][j--] = cur++;
            while (i > 0 && result[i-1][j] == 0)
                result[i--][j] = cur++;
        }

        result[i][j] = n * n;
        return result;
    }

    public int[][] generateMatrix3(int n) {
        int[][] result = new int[n][n];
        int i = 0, j = 0, cur = 1;
        if (n == 0)
            return result;
        result[0][0] = 1;
        while (cur < n * n) {
            while (j < n - 1 && result[i][j+1] == 0)
                result[i][++j] = ++cur;
            while (i < n - 1 && result[i+1][j] == 0)
                result[++i][j] = ++cur;
            while (j > 0 && result[i][j-1] == 0)
                result[i][--j] = ++cur;
            while (i > 0 && result[i-1][j] == 0)
                result[--i][j] = ++cur;
        }
        return result;
    }
}
