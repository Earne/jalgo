/**
Write an efficient algorithm that searches for a value in an m x n matrix.
This matrix has the following properties:

    Integers in each row are sorted from left to right.
    The first integer of each row is greater than the last integer of the previous row.

For example,

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]

Given target = 3, return true.
 */
public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null)
            return false;
        int A = matrix.length;
        int B = matrix[0].length;
        int lo = 0;
        int hi = (A - 1) * B + (B - 1);
        int mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (matrix[mid / B][mid % B] == target)
                return true;
            if (matrix[mid / B][mid % B] < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return false;
    }
}
