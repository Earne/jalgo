import java.util.Stack;

/**
 * 用栈实现队列
 * 正如标题所述，你需要使用两个栈来实现队列的一些操作。
 * <p/>
 * 队列应支持push(element)，pop() 和 top()，其中pop是弹出队列中的第一个(最前面的)元素。
 * <p/>
 * pop和top方法都应该返回第一个元素的值。
 * 样例
 * <p/>
 * 比如push(1), pop(), push(2), push(3), top(), pop()，你应该返回1，2和2
 * 挑战
 * <p/>
 * 仅使用两个栈来实现它，不使用任何其他数据结构，push，pop 和 top的复杂度都应该是均摊O(1)的
 */
public class ImplementQueueByTwoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public ImplementQueueByTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int element) {
        stack1.push(element);
    }

    public int pop() {
        if (!stack2.isEmpty())
            return stack2.pop();
        while (stack1.size() != 1)
            stack2.push(stack1.pop());
        return stack1.pop();
    }

    public int top() {
        if (!stack2.isEmpty())
            return stack2.peek();
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
        return stack2.peek();
    }
}
