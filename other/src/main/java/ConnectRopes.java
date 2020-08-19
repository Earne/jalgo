import java.util.PriorityQueue;

public class ConnectRopes {
    public int minimumCostToConnectRopes(int[] ropeLengths) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int rope : ropeLengths) {
            heap.add(rope);
        }
        int result = 0;
        while (heap.size() > 1) {
            int sumOrPeek2 = heap.poll() + heap.poll();
            result += sumOrPeek2;
            heap.add(sumOrPeek2);
        }

        return  result;
    }
}
