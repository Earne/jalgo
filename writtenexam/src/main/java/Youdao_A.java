import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by earne on 9/24/15.
 */
public class Youdao_A {
    public static void foo(TreeNode root) {
        Queue<TreeNode> preQueue = new LinkedList<>();
        Queue<TreeNode> curQueue = new LinkedList<>();
        preQueue.add(root);
        Deque<Integer> deque = new LinkedList<>();
//        deque.add(root.val);
        while (!preQueue.isEmpty()) {
            curQueue = new LinkedList<>();
            while (!preQueue.isEmpty()) {
                if (preQueue.peek().left != null) {
                    curQueue.add(preQueue.peek().left);
                    deque.add(preQueue.peek().left.val);
                }
                if (preQueue.peek().right != null) {
                    curQueue.add(preQueue.peek().right);
                    deque.add(preQueue.peek().right.val);
                }
                preQueue.poll();
            }
            if (!curQueue.isEmpty()) {
                int head = deque.getLast();
                deque.removeLast();
                deque.addFirst(head);
                for (TreeNode node : curQueue) {
                    node.val = deque.getFirst();
                    deque.removeFirst();
                }
            }
            preQueue = curQueue;
        }
    }
}
