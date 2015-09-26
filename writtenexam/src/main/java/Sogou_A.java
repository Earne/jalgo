/**
 * Created by Earne on 2015/9/26.
 */

import java.awt.geom.Point2D;
import java.util.Scanner;

public class Sogou_A {

    static int[] getClosest(Point2D.Double[] points) {
        int[] result = new int[2];
        /* 在这里补充代码, 注意，要求result[0] < result[1] */
        /* distance = points[0].distance(points[1]) */
        double mindis = Double.MAX_VALUE;
        double dis = mindis;
        int p = 0, q = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                dis = points[i].distance(points[j]);
                if (dis < mindis) {
                    mindis = dis;
                    p = i;
                    q = j;
                }
            }
        }
        result[0] = p;
        result[1] = q;
        return result;
    }

    public static void main(String[] args) {
        Point2D.Double[] points;
        Scanner input = new Scanner(System.in);
        {
            int n = input.nextInt();
            input.nextLine();
            points = new Point2D.Double[n];
            for (int i = 0; i < n; ++i) {
                double x = input.nextDouble();
                double y = input.nextDouble();
                input.nextLine();
                points[i] = new Point2D.Double(x, y);
            }
        }
        int[] result = getClosest(points);
        System.out.printf("Closest points: %d, %d\n", result[0], result[1]);
    }
}