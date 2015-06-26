/**
 Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.

 click to show follow up.
 Follow up:

 Did you use extra space?
 A straight forward solution using O(mn) space is probably a bad idea.
 A simple improvement uses O(m + n) space, but still not the best solution.
 Could you devise a constant space solution?

 */
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        if (matrix == null)
            return;
        final int A = matrix.length;
        final int B = matrix[0].length;
        boolean r = false;
        boolean c = false;

        for (int i = 0; i < B; i++) {
            if (matrix[0][i] == 0)
                r = true;
        }

        for (int i = 0; i < A; i++) {
            if (matrix[i][0] == 0)
                c = true;
        }

        for (int i = 1; i < A; i++) {
            for (int j = 1; j < B; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < A; i++) {
            for (int j = 1; j < B; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }

        if (r)
            for (int i = 0; i < B; i++)
                matrix[0][i] = 0;

        if (c)
            for (int i = 0; i < A; i++)
                matrix[i][0] = 0;
    }
}
