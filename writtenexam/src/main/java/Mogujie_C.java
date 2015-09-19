import java.util.Scanner;

/**
 * Created by Earne on 2015/9/19.
 */
public class Mogujie_C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int r = cin.nextInt();
        int x = cin.nextInt();
        int y = cin.nextInt();
        int p = cin.nextInt();
        int q = cin.nextInt();
        double des = Math.sqrt(Math.pow((p - x), 2) + Math.pow((q - y), 2));
        System.out.println((int) Math.ceil(des / (2 * r)));
    }
}
