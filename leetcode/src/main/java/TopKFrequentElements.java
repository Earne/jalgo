import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        // 数字及其出现次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (heap.size() < k) {
                heap.add(entry);
            } else {
                Map.Entry<Integer, Integer> peek = heap.peek();
                if (peek.getValue() < entry.getValue()) {
                    heap.poll();
                    heap.add(entry);
                }
            }
        }

        int[] result = new int[k];
        while (--k >= 0) {
            result[k] = heap.poll().getKey();
        }
        return result;
    }
}
