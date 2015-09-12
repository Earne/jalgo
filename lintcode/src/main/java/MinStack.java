/**
 * 带最小值操作的栈
 * 实现一个带有取最小值min方法的栈，min方法将返回当前栈中的最小值。
 * <p/>
 * 你实现的栈将支持push，pop 和 min 操作，所有操作要求都在O(1)时间内完成。
 * 样例
 * <p/>
 * 如下操作：push(1)，pop()，push(2)，push(3)，min()， push(1)，min() 返回 1，2，1
 * 注意
 * <p/>
 * 如果堆栈中没有数字则不能进行min方法的调用
 */
public class MinStack {
    StackNode head = null;
    StackNode minHead = null;

    public MinStack() {
    }

    public void push(int number) {
        head = new StackNode(number, head);
        if (minHead == null) {
            minHead = new StackNode(number, null);
        } else {
            minHead = new StackNode(Math.min(number, minHead.val), minHead);
        }
    }

    public int pop() {
        int res = head.val;
        head = head.next;
        minHead = minHead.next;
        return res;
    }

    public int min() {
        return minHead.val;
    }

    class StackNode {
        int val;
        StackNode next;

        public StackNode(int val, StackNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

