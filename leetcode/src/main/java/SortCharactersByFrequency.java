import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<List<Character>> bucket = new ArrayList<>(Collections.nCopies(s.length() + 1, null));
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (bucket.get(entry.getValue()) == null) {
                List<Character> cs = new ArrayList<>();
                cs.add(entry.getKey());
                bucket.add(entry.getValue(), cs);
            } else {
                bucket.get(entry.getValue()).add(entry.getKey());
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = s.length(); i >= 0; i--) {
            if (bucket.get(i) != null) {
                for (char c : bucket.get(i)) {
                    for (int j = 0; j < i; j++) {
                        sb.append(c);
                    }
                }
            }
        }

        return sb.toString();
    }
}
