import java.util.PriorityQueue;

/**
 * @author gengyuanzhen
 */
public class KthLargestElementInAStream {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    int k;

    public KthLargestElementInAStream(int k, int[] nums) {
        for (int num : nums) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        this.k = k;
    }

    public int add(int val) {
        heap.add(val);
        if (heap.size() > k) {
            heap.poll();
        }
        return heap.peek();
    }
}
