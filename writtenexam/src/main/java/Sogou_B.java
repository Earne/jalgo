import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sogou_B {

    static void shuffle(int a[], int seed) {
        int n = a.length;
        Random rand = new Random(seed);
        for (; n > 1; n--) {
            int r = rand.nextInt(n);
            int tmp = a[n - 1];
            a[n - 1] = a[r];
            a[r] = tmp;
        }
    }

    static void restore(int a[], int seed) {
        /* 填写代码 */
        int n = a.length;
        Random rand = new Random(seed);
        int[] rs = new int[n];
        for (; n > 1; n--) {
            rs[n - 1] = rand.nextInt(n);
        }
//        System.out.println(Arrays.toString(rs));
        n = a.length;

        for (int i = 0; i < n; i++) {
            int tmp = a[i];
            a[i] = a[rs[i]];
            a[rs[i]] = tmp;
        }
    }

    public static void main(String[] args) {
        int seed, n, i;
        int[] a, b;
        Scanner input = new Scanner(System.in);
        {
            seed = input.nextInt();
            n = input.nextInt();
            a = new int[n];
            for (i = 0; i < n; ++i)
                a[i] = input.nextInt();
        }
        b = Arrays.copyOf(a, a.length);
        shuffle(a, seed);
        restore(a, seed);
        System.out.println(Arrays.toString(a));
        for (i = 0; i < n; i++) {
            if (a[i] != b[i])
                break;
        }
        if (i == n)
            System.out.printf("Success!\n");
        else
            System.out.printf("Failed!\n");
    }
}

