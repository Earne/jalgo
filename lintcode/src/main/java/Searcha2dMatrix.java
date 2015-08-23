/**
 * 搜索二维矩阵
 * 写出一个高效的算法来搜索 m × n矩阵中的值。
 * <p/>
 * 这个矩阵具有以下特性：
 * <p/>
 * 每行中的整数从左到右是排序的。
 * 每行的第一个数大于上一行的最后一个整数。
 * <p/>
 * 样例
 * <p/>
 * 考虑下列矩阵：
 * <p/>
 * [
 * [1, 3, 5, 7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * <p/>
 * 给出 target = 3，返回 true
 * 挑战
 * <p/>
 * O(log(n) + log(m)) 时间复杂度
 */
public class Searcha2dMatrix {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;
        if (matrix[0] == null || matrix[0].length == 0)
            return false;

        int row = matrix.length, column = matrix[0].length;
        int begin = 0, end = row * column - 1, mid;

        while (begin < end) {
            mid = begin + (end - begin) / 2;
            int cur = matrix[mid / column][mid % column];
            if (cur == target)
                return true;
            else if (cur < target)
                begin = mid + 1;
            else
                end = mid - 1;
        }
        return (matrix[begin / column][begin % column] == target);
    }
}
