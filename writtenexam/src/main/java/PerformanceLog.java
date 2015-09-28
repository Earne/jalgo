import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Earne on 2015/9/28.
 */

class PLNode {
    static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    static {
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
    }
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
        Map<String, String> res = new LinkedHashMap<>();
        Stack<PLNode> stack = new Stack<>();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        boolean isError = false;
        Date curTime = null;
        for (int i = 0; i < N; i++) {
            String[] curStr = cin.nextLine().split(" ");
            PLNode cur = new PLNode(curStr[0], curStr[1], curStr[2]);
            if (curTime == null)
                curTime = sdf.parse(curStr[1]);
            else if (curTime.compareTo(cur.stamp) >= 0) {
                isError = true;
                break;
            } else {
                curTime = cur.stamp;
            }

            if (!stack.isEmpty()
                    && stack.peek().name.equals(cur.name)
                    && stack.peek().action.equals("START")
                    && cur.action.equals("END")) {
//                res.put(cur.name, sdf.format(new Date(cur.stamp.getTime() -
//                        stack.peek().stamp.getTime())));
                res.put(cur.name, helper(cur.stamp.getTime() -
                        stack.peek().stamp.getTime()));
                stack.pop();
            } else {
                if (res.containsKey(cur.name)) {
                    isError = true;
                    break;
                }
                stack.push(cur);
                res.put(cur.name, null);
            }
        }

        if (isError || !stack.isEmpty()) {
            System.out.println("Incorrect performance log");
        } else {
            for (Map.Entry<String, String> entry : res.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

    private static String helper(long l) {
        int hour = (int) ((l / 1000) / (60 * 60));
        int min = (int) ((l / 1000) / (60) % 60);
        int s = (int) ((l / 1000) % 60);
        StringBuilder sb = new StringBuilder();
        if (hour < 10)
            sb.append('0').append(hour).append(':');
        else
            sb.append(hour + ":");
        if (min < 10)
            sb.append('0').append(min).append(":");
        else
            sb.append(min + ":");

        if (s < 10)
            sb.append('0').append(s);
        else
            sb.append(s);

        return sb.toString();
    }
}
