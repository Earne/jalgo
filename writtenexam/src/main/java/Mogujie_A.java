import java.util.Scanner;

/**
 * Created by Earne on 2015/9/19.
 */
public class Mogujie_A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.next();
        boolean hasAdd = false;
        int i, j;
        for (i = 0, j = str.length() - 1; i < j; ) {
            if (str.charAt(i) != str.charAt(j) && !hasAdd) {
                hasAdd = true;
                i++;
            } else if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else if (hasAdd) {
                System.out.println("NO");
                break;
            }
        }
        if (i >= j)
            System.out.println("YES");
    }
}
