import java.util.*;

/**
 * Created by Earne on 2015/9/26.
 * 3
 * 1.0 1.0002
 * 0.0 -0.001
 * 3.03 3.023
 * <p/>
 * 5
 * 0 1
 * 0 3
 * 1 0
 * 4 0
 * 0 2
 */
class Res {
    int p;
    int q;

    public Res(int p, int q) {
        this.p = p;
        this.q = q;
    }
}

class Point implements Comparable<Point> {
    double x;
    double y;
    int index;

    public Point(double x, double y, int index) {
        this.x = x;
        this.y = y;
        this.index = index;
    }

    public static Comparator<Point> getXYComparator() {
        return new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.x != o2.x)
                    return Double.compare(o1.x, o2.x);
                return Double.compare(o1.y, o2.y);
            }
        };
    }

    public static Comparator<Point> getYComparator() {
        return new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return Double.compare(o1.y, o2.y);
            }
        };
    }

    @Override
    public int compareTo(Point o) {
        return 0;
    }
}

public class Sogou_A_Foo {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        List<Point> list = new ArrayList<Point>();
//        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            list.add(new Point(cin.nextDouble(), cin.nextDouble(), i));
        }

        Collections.sort(list, Point.getYComparator());
        List<Point> tmp = new ArrayList<Point>();
        for (int i = 0; i < N; i++) {
            tmp.add(new Point(0, 0, i));
        }

        Res res = new Res(0, 0);
        double d = helper(res, tmp, list, 0, list.size() - 1);
        if (res.p > res.q) {
            System.out.printf("Closest points: %d, %d\n", res.q, res.p);
        } else {
            System.out.printf("Closest points: %d, %d\n", res.p, res.q);
        }
//        System.out.println(d + " " + res.p + " " + res.q);
//        System.out.println(helper(list, 0, list.size() - 1));
    }

    private static double helper(Res res, List<Point> tmp, List<Point> list, int left, int right) {
        double d = Double.MAX_VALUE;
        if (left == right) {
//            res.p = left;
//            res.q = right;
            return d;
        }
        if (left + 1 == right) {
//            res.p = left;
//            res.q = right;
            return dis(list, left, right);
        }
        int mid = left + (right - left) / 2;
        double d1 = helper(res, tmp, list, left, mid);
        double d2 = helper(res, tmp, list, mid + 1, right);

        if (d1 < d2) {
            d = d2;
//            res.p = mid + 1;
//            res.q = right;
        } else {
            d = d1;
//            res.p = left;
//            res.q = mid;
        }
//        d = Math.max(d1, d2);
//        int i, j, k;
        int k = 0;
        for (int i = left; i <= right; i++) {
            if (Math.abs(list.get(mid).x - list.get(i).x) <= d) {
                tmp.set(k++, list.get(i));
            }
        }
        Collections.sort(tmp, Point.getYComparator());

        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k && tmp.get(j).y - tmp.get(i).y < d; j++) {
                double d3 = dis(tmp, i, j);
                if (d > d3) {
                    d = d3;
                    res.p = tmp.get(i).index;
                    res.q = tmp.get(j).index;
                }
            }
        }

        return d;
    }

    private static double dis(List<Point> list, int left, int right) {
        return Math.sqrt(Math.pow(list.get(left).x - list.get(right).x, 2) +
                Math.pow(list.get(left).y - list.get(right).y, 2));
    }
}
