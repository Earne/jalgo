import java.util.Collections;
import java.util.PriorityQueue;

class SumOfElements {
    public static int findSumOfElements(int[] nums, int k1, int k2) {
        // 存储最小的k1个数
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k1, Collections.reverseOrder());
        // 存储最大的nums.length - k2 + 1个数
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(nums.length - k2 + 1);
        int result = 0;
        for (int i = 0; i < k1 + nums.length - k2 + 1; i++) {
            if (maxHeap.size() < k1) {
                maxHeap.add(nums[i]);
            } else {
                if (!maxHeap.isEmpty() && maxHeap.peek() > nums[i]) {
                    minHeap.add(maxHeap.poll());
                } else {
                    minHeap.add(nums[i]);
                }
            }
        }

        for (int i = k1 + nums.length - k2 + 1; i < nums.length; i++) {
            int cur = nums[i];
            if (cur > maxHeap.peek() && cur < minHeap.peek()) {
                result += cur;
            } else if (cur < maxHeap.peek()) {
                result += maxHeap.poll();
                maxHeap.add(cur);
            } else {
                result += minHeap.poll();
                minHeap.add(cur);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result = SumOfElements.findSumOfElements(new int[]{1, 3, 12, 5, 15, 11}, 3, 6);
        System.out.println("Sum of all numbers between k1 and k2 smallest numbers: " + result);
        result = SumOfElements.findSumOfElements(new int[]{3, 5, 8, 7}, 1, 4);
        System.out.println("Sum of all numbers between k1 and k2 smallest numbers: " + result);
    }
}
