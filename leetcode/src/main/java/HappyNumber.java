import java.util.HashSet;
import java.util.Set;

/**
 * Created by earne on 6/24/15.
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        int old = n;
        while (true) {
            int re = 0;
            while (old != 0) {
                re += (old % 10) * (old % 10);
                old /= 10;
            }
            if (re == 1)
                return true;
            if (set.contains(re))
                return false;
            set.add(re);
            old = re;
        }
    }
}
