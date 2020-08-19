import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author gengyuanzhen
 */
public class TaskScheduler {
    public String leastInterval(char[] tasks, int n) {
        if (tasks == null || tasks.length == 0) {
            return "";
        }

        // 存储字符及其出现的次数
        Map<Character, Integer> map = new HashMap<>();
        for (char c : tasks) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> heap = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));
        heap.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();

        while (!heap.isEmpty()) {
            Queue<Map.Entry<Character, Integer>> queue = new LinkedList<>();
            int i = n + 1;
            for (; i > 0 && !heap.isEmpty(); i--) {
                Map.Entry<Character, Integer> peek = heap.poll();
                sb.append(peek.getKey());
                if (peek.getValue() > 1) {
                    peek.setValue(peek.getValue() - 1);
                    queue.add(peek);
                }
            }
            heap.addAll(queue);
            while (i-- > 0) {
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }
}

class Pair {
    Character left;
    Integer right;

    public Pair(Character left, Integer right) {
        this.left = left;
        this.right = right;
    }

    public Character getLeft() {
        return left;
    }

    public void setLeft(Character left) {
        this.left = left;
    }

    public Integer getRight() {
        return right;
    }

    public void setRight(Integer right) {
        this.right = right;
    }
}
