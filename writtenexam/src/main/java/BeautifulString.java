import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

/**
 * 微软校招_2015
 */
public class BeautifulString {
    public static void main(String[] args) throws IOException {
        StreamTokenizer cin = new StreamTokenizer(new BufferedReader(
                new InputStreamReader(System.in)));

        cin.nextToken();
        int T = (int) cin.nval;
        while (T-- != 0) {
            cin.nextToken();
            int N = (int) cin.nval;
            cin.nextToken();
            String a = cin.sval;
            StringBuilder sb = new StringBuilder();
            List<Integer> counts = new ArrayList<>();
            for (int i = 0; i < a.length(); i++) {
                char cur = a.charAt(i);
                sb.append(cur);
                i++;
                int count = 1;
                while (i < a.length() && a.charAt(i) == cur) {
                    count++;
                    i++;
                }
                i--;
//                sb.append(count);
                counts.add(count);
            }

//            System.out.println(sb.toString());
            boolean flag = false;
            for (int i = 0; i <= sb.length() - 3; i++) {
                char fir = sb.charAt(i);
                int fc = counts.get(i);
                char sec = sb.charAt(i + 1);
                int sc = counts.get(i + 1);
                char thr = sb.charAt(i + 2);
                int tc = counts.get(i + 2);
                if (fir + 1 == sec && sec + 1 == thr && fc >= sc && sc <= tc) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
