import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 10 // N 个数
 * 20
 * 32
 * 12
 * 32
 * 45
 * 11
 * 21
 * 31
 * 41
 * 33
 */

class Pair implements Comparable<Pair> {
    int score;
    int index;

    public Pair(int score, int index) {
        this.score = score;
        this.index = index;
    }

    @Override
    public int compareTo(Pair o) {
        if (this.score > o.score)
            return 1;
        else if (this.score < o.score)
            return -1;
        else
            return 0;
    }
}

public class Sohu_C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        List<Pair> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            list.add(new Pair(cin.nextInt(), i));
        }
        Collections.sort(list);
        int[] moneys = new int[list.size()];
        for (Pair p : list) {
            if (p.index == 0) {
                moneys[0] = moneys[1] + 1;
            } else if (p.index == list.size() - 1) {
                moneys[p.index] = moneys[p.index - 1] + 1;
            } else {
                moneys[p.index] = Math.max(moneys[p.index - 1], moneys[p.index + 1]) + 1;
            }
        }

        int res = 0;
        for (int i : moneys)
            res += i;
        System.out.println(res);
    }
}
