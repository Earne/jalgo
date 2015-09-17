import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by earne on 9/17/15.
 */
public class DianPing_A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        BigDecimal bn = new BigDecimal(n);
        System.out.println(helper(bn));
    }

    private static BigDecimal helper(BigDecimal bn) {
        if (bn.intValue() == 0)
            return new BigDecimal(1);
        return bn.multiply(helper(bn.subtract(new BigDecimal(1))));
    }

//    private static long helper(long n) {
//        if (n == 0)
//            return 1;
//        return n * helper(n - 1);
//    }
}
