import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class MaximumDistinctElements {
    public static int findMaximumDistinctElements(int[] nums, int k) {
        // 存储数字及出现次数
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> (a.getValue() - b.getValue()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                heap.add(entry);
            }
        }

        int result = map.size() - heap.size();

        while (!heap.isEmpty() && k > 0) {
            Map.Entry<Integer, Integer> peek = heap.peek();
            if (peek.getValue() - 1 <= k) {
                k -= (peek.getValue() - 1);
                heap.poll();
                result++;
            } else {
                k = 0;
                break;
            }
        }

        return result - k;
    }

    public static void main(String[] args) {
        int result = MaximumDistinctElements.findMaximumDistinctElements(new int[]{7, 3, 5, 8, 5, 3, 3}, 2);
        System.out.println("Maximum distinct numbers after removing K numbers: " + result);
        result = MaximumDistinctElements.findMaximumDistinctElements(new int[]{3, 5, 12, 11, 12}, 3);
        System.out.println("Maximum distinct numbers after removing K numbers: " + result);
        result = MaximumDistinctElements.findMaximumDistinctElements(new int[]{1, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5}, 2);
        System.out.println("Maximum distinct numbers after removing K numbers: " + result);
    }
}
