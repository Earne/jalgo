/**
 * Created by earne on 9/23/15.
 */
public class Amazon_A {
    public static void main(String[] args) {
        traPP(5);
    }

    public static void traPP(int n) {
        int start = 1;
        int nextStart = 1 + n;
        int ano;
        int line = 0;
        for (int i = 0; i < n; i++) { // print line i
            for (int j = 0; j < i; j++) { // 打印前导_
                System.out.print("--");
            }
            int prePart;
            for (prePart = start; prePart < start + n - i; prePart++) {
                System.out.printf("%d*", prePart);
            }

            start = prePart;

            ano = (n - i - 1) * (n - i) + start;
            for (int j = ano; j < ano + n - i - 1; j++) {
                System.out.printf("%d*", j);
            }
            System.out.print(ano + n -i - 1);

            System.out.println();

        }
    }
}
