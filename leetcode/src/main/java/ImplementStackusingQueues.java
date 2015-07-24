import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement the following operations of a stack using queues.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * empty() -- Return whether the stack is empty.
 * <p>
 * Notes:
 * <p>
 * You must use only standard operations of a queue -- which means only push to back,
 * peek/pop from front, size, and is empty operations are valid.
 * Depending on your language, queue may not be supported natively.
 * You may simulate a queue by using a list or deque (double-ended queue),
 * as long as you use only standard operations of a queue.
 * You may assume that all operations are valid
 * (for example, no pop or top operations will be called on an empty stack).
 * <p>
 * Update (2015-06-11):
 * The class name of the Java function had been updated to MyStack instead of Stack.
 */
public class ImplementStackusingQueues {
    Queue<Integer> A = new LinkedList<Integer>();
    Queue<Integer> B = new LinkedList<Integer>();

    // Push element x onto stack.
    public void push(int x) {
        if (!B.isEmpty())
            B.add(x);
        else
            A.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        if (!A.isEmpty()) {
            while (A.size() > 1) {
                B.add(A.peek());
                A.poll();
            }
            A.poll();
        } else {
            while (B.size() > 1) {
                A.add(B.peek());
                B.poll();
            }
            B.poll();
        }
    }

    // Get the top element.
    public int top() {
        int result;
        if (!A.isEmpty()) {
            while (A.size() > 1) {
                B.add(A.peek());
                A.poll();
            }
            result = A.peek();
            B.add(A.peek());
            A.poll();
        } else {
            while (B.size() > 1) {
                A.add(B.peek());
                B.poll();
            }
            result = B.peek();
            A.add(B.peek());
            B.poll();
        }
        return result;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }
}
