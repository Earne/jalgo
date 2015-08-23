/**
 * 搜索二维矩阵 II
 * 写出一个高效的算法来搜索m×n矩阵中的值，返回这个值出现的次数。
 * <p/>
 * 这个矩阵具有以下特性：
 * <p/>
 * 每行中的整数从左到右是排序的。
 * 每一列的整数从上到下是排序的。
 * 在每一行或每一列中没有重复的整数。
 * <p/>
 * 您在真实的面试中是否遇到过这个题？
 * 样例
 * <p/>
 * 考虑下列矩阵：
 * <p/>
 * [
 * <p/>
 * [1, 3, 5, 7],
 * <p/>
 * [2, 4, 7, 8],
 * <p/>
 * [3, 5, 9, 10]
 * <p/>
 * ]
 * <p/>
 * 给出target = 3，返回 2
 * 挑战
 * <p/>
 * 要求O(m+n) 时间复杂度和O(1) 额外空间
 */
public class SearchA2dMatrixII {
    /**
     * @param matrix: A list of lists of integers
     * @param target: A number you want to search in the matrix
     * @return res: An integer indicate the occurrence of target in the given matrix
     */
    public int searchMatrix(int[][] matrix, int target) {
        int res = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return res;
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int row = 0;
        int col = colCount - 1;

        while (row < rowCount && col >= 0) {
            if (matrix[row][col] > target)
                col--;
            else if (matrix[row][col] == target) {
                res++;
                col--;
                row++;
            } else
                row++;
        }
        return res;
    }
}
