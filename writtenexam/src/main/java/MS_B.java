import java.util.Scanner;

/**
 * Created by earne on 9/29/15.
 */
public class MS_B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int M = cin.nextInt();
        int[][] matrix = new int[N][N];
        int[][] dis = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    matrix[i][j] = 2000 * N;
                }
            }
        }

        for (int i = 1; i < N; i++) {
            int p = cin.nextInt();
            int q = cin.nextInt();
            int tmp = cin.nextInt();
            matrix[p - 1][q - 1] = tmp;
            matrix[q - 1][p - 1] = tmp;
        }

//        dis = floyd(matrix);

        cin.nextLine();

        for (int i = 0; i < M; i++) {
            String action = cin.nextLine();
            int res = 0;
            if (action.equals("QUERY")) {
                dis = floyd(matrix);
                for (int j = 0; j < matrix.length; j++) {
                    for (int k = j + 1; k < matrix.length; k++) {
                        res += dis[j][k];
                    }
                }
                System.out.println(res);
            } else {
                String[] strs = action.split(" ");
                int p = Integer.parseInt(strs[1]);
                int q = Integer.parseInt(strs[2]);
                int k = Integer.parseInt(strs[3]);
                matrix[p - 1][q - 1] = k;
                matrix[q - 1][p - 1] = k;
//                dis = floyd(matrix);
            }

        }
    }

    private static int[][] floyd(int[][] matrix) {
        int[][] dis = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                dis[i][j] = matrix[i][j];
            }
        }
        int n = matrix.length;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dis[i][j] > dis[i][k] + dis[k][j]) {
                        dis[i][j] = dis[i][k] + dis[k][j];
                    }
                }
            }
        }
        return dis;
    }

}
