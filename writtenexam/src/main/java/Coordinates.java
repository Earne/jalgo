import java.util.*;

/**
 * 探星夏令营
 */
class Coo implements Comparable<Coo> {
    int x;
    int y;

    public Coo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Coo o) {
        if (this.x > o.x)
            return 1;
        else if (this.x < o.x)
            return -1;
        else {
            if (this.y > o.y)
                return 1;
            else if (this.y < o.y)
                return -1;
            else
                return 0;
        }
    }
}

public class Coordinates {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int P = cin.nextInt();
        int Q = cin.nextInt();
        List<Integer> pD = new ArrayList<>();
        List<Integer> qD = new ArrayList<>();
        helpD(P, pD);
        helpD(Q, qD);

        List<Coo> coos = new LinkedList<>();
        for (Integer i : pD) {
            for (Integer j : qD) {
                coos.add(new Coo(i, j));
            }
        }

        Collections.sort(coos);

        for (Coo coo : coos) {
            System.out.println(coo.x + " " + coo.y);
        }
    }

    private static void helpD(int p, List<Integer> pD) {
        pD.add(1);
        for (int i = 2; i <= p; i++) {
            if (p % i == 0)
                pD.add(i);
        }
    }
}
