import java.util.Arrays;

/**
 * Created by earne on 6/11/15.
 */
public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        int[] result = new int[n+1];
        result[0] = 1;
        result[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                result[i] += result[j] * result[i - j - 1];
            }
        }
        return result[n];
    }
}
