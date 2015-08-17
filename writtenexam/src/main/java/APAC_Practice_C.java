import java.io.File;
import java.util.Scanner;

/**
 * Created by earne on 8/16/15.
 */
public class APAC_Practice_C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
//        Scanner cin = new Scanner(new File("/tmp/C-small-1-attempt0.in"));
        int T = cin.nextInt();
        for (int i = 0; i < T; i++) {
            int res = 0;
            int N = cin.nextInt();
            cin.nextLine();
            String max = cin.nextLine();
            while (N-- != 1) {
                String current = cin.nextLine();
                if (current.compareTo(max) > 0) {
                    max = current;
                } else
                    res++;
            }
            System.out.printf("Case #%d: %d\n", i + 1, res);
        }
    }
}
