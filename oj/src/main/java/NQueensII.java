/**
 * Created by earne on 6/11/15.
 */
public class NQueensII {
    int result = 0;
    int[] cur;

    public int totalNQueens(int n) {
        cur = new int[n];
        helper(0, n);
        return result;
    }

    private void helper(int current, int n) {
        if (current == n)
            result++;
        else for (int i = 0; i < n; i++) {
            boolean isOk = true;
            cur[current] = i; // 把当前行放在第i列
            for (int j = 0; j < current; j++) // 检查当前行与前面各行
                if (i == cur[j] || // 当前行与j行皇后放在了同一列
                        current - i == j - cur[j] || // 当前行与j行皇后放在了同一对角线
                        current + i == j + cur[j] // 当前行与j行皇后放在同一反对角线
                        ) {
                    isOk = false;
                    break;
                }
            if (isOk)
                helper(current+1, n);
        }
    }
}
