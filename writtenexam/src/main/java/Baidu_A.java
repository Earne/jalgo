import java.util.Scanner;

public class Baidu_A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        int n = cin.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = cin.nextInt();
            }
        }
        System.out.println(helper(array));
    }

    private static int helper(int[][] array) {
        int nr = array.length;
        int nc = array[0].length;
        int[] A = new int[nc];
        int[] B = new int[nc];
        for (int i = 0; i < nc; i++) {
            if (array[nr - 1][i] != 0)
                A[i] = 1;
            else
                break;
        }

        for (int i = nr - 2; i >= 0; i--) {
            for (int j = 0; j < nc; j++) {
                if (array[i][j] != 0)
                    B[j] = (j == 0) ? A[j] : A[j] + A[j - 1] + B[j - 1];
                else
                    B[j] = 0;
            }
            int[] tmp = B;
            B = A;
            A = tmp;
        }
        return A[A.length - 1];
    }
}
