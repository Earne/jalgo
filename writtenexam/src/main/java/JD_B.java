import java.util.Scanner;

/**
 * Created by Earne on 2015/9/18.
 */
public class JD_B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int A = cin.nextInt();
        int B = cin.nextInt();
        int C = cin.nextInt();
        int D = cin.nextInt();
        System.out.println(helper(A) + helper(B) + helper(C) + helper(D));
    }

    private static int helper(int val) {
        int res = val;

        while (val > 0) {
            val /= 2;
            res += val * 2;
        }
        return res;
    }
}
