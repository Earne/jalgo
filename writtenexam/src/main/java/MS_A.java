import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by earne on 9/29/15.
 */
class MSAPoint implements Comparable<MSAPoint> {
    int x;
    int y;

    public MSAPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(MSAPoint o) {
        if (this.x > o.x) {
            return 1;
        } else if (this.x < o.x) {
            return -1;
        } else {
            if (this.y > o.y)
                return 1;
            else if (this.y < o.y)
                return -1;
            else return 0;
        }
    }
}

public class MS_A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double x = cin.nextDouble();
        double y = cin.nextDouble();
        double r = cin.nextDouble();

        int resX = 0, resY = 0;

        double maxDis = Double.MIN_VALUE;
        int maxX = (int) Math.floor(x + r);

        int minX = new Double(x - r).intValue();
//        if (new Double(x - r).compareTo((double) 0) > 0)
//            minX = (int) Math.floor(x - r);
//        else {
//            minX = (int) Math.round(x - r);
//        }

        boolean hasRes = false;
        List<MSAPoint> list = new ArrayList<>();
        for (int i = maxX; i >= minX; i--) {
            Double tmpY = Math.sqrt(Math.pow(r, 2) - Math.pow((double)i - x, 2)) + y;
            int iY = tmpY.intValue();
            Double anoY = y - Math.sqrt(Math.pow(r, 2) - Math.pow((double)i - x, 2));
            int aiY = anoY.intValue();

            for (int j = iY; j >= aiY; j--) {
                if (inCircle(x, y, r, i, j)) {
                    double curDis = distance(x, y, r, i, j);
                    if (Double.compare(maxDis, curDis) < 0) {
                        maxDis = curDis;
                        list.add(new MSAPoint(i, j));
                    } else {
                        break;
                    }
                } else
                    break;
            }

            for (int j = aiY; j <= iY; j++) {
                if (inCircle(x, y, r, i, j)) {
                    double curDis = distance(x, y, r, i, j);
                    if (Double.compare(maxDis, curDis) < 0) {
                        maxDis = curDis;
                        list.add(new MSAPoint(i, j));
                    } else {
                        break;
                    }
                }
            }

        }
        Collections.sort(list);
        System.out.println(list.get(list.size() - 1).x + " " + list.get(list.size() - 1).y);
    }

    private static double distance(double x, double y, double r, int i, int j) {
        return Math.sqrt(Math.pow(x - i, 2) + Math.pow(y - j, 2));
    }

    private static boolean inCircle(double x, double y, double r, int i, int j) {
        return (Double.compare(Math.sqrt(Math.pow(x - i, 2) + Math.pow(y - j, 2)), r) <= 0);
    }


}
