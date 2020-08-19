import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrisonCellsAfterNDays {
    public int[] prisonAfterNDays(int[] cells, int N) {
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int[] nextDay = nextDay(cells);
            String nextDayStr = toNumStr(nextDay);
            if (set.contains(nextDayStr)) {
                break;
            } else {
                set.add(nextDayStr);
                list.add(nextDayStr);
            }
            cells = nextDay;
        }
        String resStr = list.get((N + set.size() - 1) % (set.size()));
        int[] res = new int[cells.length];
        for (int i = 0; i < cells.length; i++) {
            res[i] = resStr.charAt(i) - '0';
        }
        return res;
    }

    private int[] nextDay(int[] cells) {
        int[] nextDay = new int[cells.length];
        for (int i = 1; i < cells.length - 1; i++) {
            nextDay[i] = (cells[i - 1] == cells[i + 1]) ? 1 : 0;
        }
        return nextDay;
    }

    private String toNumStr(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i ++) {
            sb.append(nums[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] ints = new PrisonCellsAfterNDays().prisonAfterNDays(new int[]{1,0,0,1,0,0,1,0}, 1000000000);
        System.out.println(Arrays.toString(ints));
    }
}
