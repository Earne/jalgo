import java.util.Scanner;

/**
 * Created by earne on 9/17/15.
 */
public class DianPing_A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println(helper(n));
    }

    private static int helper(int n) {
        if (n == 0)
            return 1;
        return n * helper(n - 1);
    }
}
