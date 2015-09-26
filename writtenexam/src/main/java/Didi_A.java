import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by earne on 9/25/15.
 */
public class Didi_A {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("/tmp/a.in"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner cin = new Scanner(System.in);

        String tmp;
        int rows = 1;
        List<Integer> list = new ArrayList<>();
        while (cin.hasNext()) {
            tmp = cin.next();
            if (!tmp.equals(";")) {
                list.add(Integer.parseInt(tmp));
            } else {
                rows++;
            }
        }
        int cols = list.size() / rows;

        int res = 0;
        int last = 0;
        int sum = last;
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < list.size() / rows; j++) {
                sum = last;
                last = list.get(i * cols + j) + list.get((i + 1) * cols + j);
                sum += last;
                res = Math.max(res, sum);
            }
        }
        System.out.println(res);
    }
}
