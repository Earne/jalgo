import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallestInMSortedArrays {
    public static int findKthSmallest(List<Integer[]> lists, int k) {
        PriorityQueue<Foo> heap = new PriorityQueue<>(lists.size());
        for (int i = 0; i < lists.size(); i++) {
            heap.add(new Foo(i, 0, lists.get(i)[0]));
        }
        while (!heap.isEmpty() && k > 0) {
            Foo peek = heap.poll();
            if (peek.q + 1 < lists.get(peek.p).length) {
                heap.add(new Foo(peek.p, peek.q + 1, lists.get(peek.p)[peek.q + 1]));
            }
            k--;
        }
        return heap.peek().val;
    }

    public static void main(String[] args) {
        Integer[] l1 = new Integer[]{2, 6, 8};
        Integer[] l2 = new Integer[]{3, 6, 7};
        Integer[] l3 = new Integer[]{1, 3, 4};
        List<Integer[]> lists = new ArrayList<>();
        lists.add(l1);
        lists.add(l2);
        lists.add(l3);
        int result = KthSmallestInMSortedArrays.findKthSmallest(lists, 5);
        System.out.print("Kth smallest number is: " + result);
    }
}

class Foo implements Comparable<Foo> {
    int p;
    int q;
    int val;

    public Foo(int p, int q, int val) {
        this.p = p;
        this.q = q;
        this.val = val;
    }

    @Override
    public int compareTo(Foo o) {
        return this.val - o.val;
    }
}
