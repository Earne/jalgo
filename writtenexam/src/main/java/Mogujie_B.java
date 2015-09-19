import java.util.Scanner;

/**
 * Created by Earne on 2015/9/19.
 * 2 3 0 20
 * 15 17
 * 23 26
 * 1 4
 * 7 11
 * 15 17
 */
public class Mogujie_B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int p = cin.nextInt();
        int q = cin.nextInt();
        int l = cin.nextInt();
        int r = cin.nextInt();
        int[][] A = new int[p][2];
        int[][] B = new int[q][2];
        for (int i = 0; i < p; i++) {
            A[i][0] = cin.nextInt();
            A[i][1] = cin.nextInt();
        }

        for (int i = 0; i < q; i++) {
            B[i][0] = cin.nextInt();
            B[i][1] = cin.nextInt();
        }

        int res = 0;
        for (int t = l; t <= r; t++) {
            int i = 0, j = 0;
            while (i < p && j < q) {
                if ((A[i][1] <= B[j][1] + t && A[i][1] >= B[j][0] + t) || (B[j][1] + t <= A[i][1] && B[j][1] + t >= A[i][0])) {

                    res++;
                    break;
                } else if (A[i][0] >= B[j][1] + t)
                    j++;
                else
                    i++;
            }
        }

        System.out.println(res);
    }
}
