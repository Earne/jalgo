import java.util.ArrayList;
import java.util.List;

/**
 * 顺时针打印矩阵
 */
public class PrintMatrix {
    public List<Integer> printMatrix(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null)
            return res;
        int nr = matrix.length;
        int nc = matrix[0].length;
        int start = 0;
        while (start * 2 < nr && start * 2 < nc) {
            printCircle(matrix, res, start);
            start++;
        }
        return res;
    }

    private void printCircle(int[][] matrix, List<Integer> res, int start) {
        int nr = matrix.length;
        int nc = matrix[0].length;
        int endr = nr - 1 - start;
        int endc = nc - 1 - start;
        int i = start, j = start - 1;
        while (j < endc)
            res.add(matrix[i][++j]);
        while (i < endr)
            res.add(matrix[++i][j]);
        while (j > start)
            res.add(matrix[i][--j]);
        while (i > start + 1)
            res.add(matrix[--i][j]);
    }
}
