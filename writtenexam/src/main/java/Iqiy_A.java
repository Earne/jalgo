import java.util.HashMap;
import java.util.Map;

/**
 * Created by earne on 9/26/15.
 */
public class Iqiy_A {
    public static int foo(String str) throws Exception {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            else
                map.put(str.charAt(i), 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return (int) str.charAt(i);
            }
        }
        return -1;

    }

}
