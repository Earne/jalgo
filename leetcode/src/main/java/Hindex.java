import java.util.PriorityQueue;

/**
 * @author gengyuanzhen
 */
public class Hindex {
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) {
            return 0;
        }
        // 最小堆
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int cur : citations) {
            heap.add(cur);
            while (!heap.isEmpty() && (heap.peek() < heap.size())) {
                heap.poll();
            }
        }
        if (heap.isEmpty()) {
            return 0;
        }
        return Math.min(heap.size(), heap.peek());
    }
}
