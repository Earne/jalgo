import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Earne on 2015/9/28.
 */

class PLNode {
    static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    String name;
    Date stamp;
    String action;

    public PLNode(String name, String stampStr, String action) throws ParseException {
        this.name = name;
        this.stamp = sdf.parse(stampStr);
        this.action = action;
    }
}

public class PerformanceLog {
    public static void main(String[] args) throws ParseException {
        Scanner cin = new Scanner(System.in);
        int N = Integer.parseInt(cin.nextLine());
//        List<String> res = new ArrayList<>();
        Map<String, Long> res = new LinkedHashMap<>();
        Stack<PLNode> stack = new Stack<>();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date curTime = null;
        for (int i = 0; i < N; i++) {
            String[] curStr = cin.nextLine().split(" ");
            PLNode cur = new PLNode(curStr[0], curStr[1], curStr[2]);
            if (curTime == null)
                curTime = sdf.parse(curStr[1]);

            if (curTime.compareTo(cur.stamp) > 0) {
                System.out.println("Incorrect performance log");
                break;
            } else {
                curTime = cur.stamp;
            }

            if (!stack.isEmpty()
                    && stack.peek().name.equals(cur.name)
                    && stack.peek().action.equals("START")
                    && cur.action.equals("END")) {
                res.put(cur.name, cur.stamp.getTime() - stack.peek().stamp.getTime());
                stack.pop();
            } else {
                stack.push(cur);
                res.put(cur.name, 0L);
//                res.add(cur.name + " " +
//                        (cur.stamp.getTime() - stack.peek().stamp.getTime()));
//                        sdf.format(new Date((cur.stamp.getTime() - stack.peek().stamp.getTime()) / 1000)));
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Incorrect performance log");
        } else {
            for (Map.Entry<String, Long> entry : res.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
