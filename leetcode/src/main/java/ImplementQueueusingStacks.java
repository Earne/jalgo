import java.util.Stack;

/**
 * Implement the following operations of a queue using stacks.
 * <p>
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * <p>
 * Notes:
 * <p>
 * You must use only standard operations of a stack -- which means only push to top,
 * peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, stack may not be supported natively.
 * You may simulate a stack by using a list or deque (double-ended queue),
 * as long as you use only standard operations of a stack.
 * You may assume that all operations are valid (for example,
 * no pop or peek operations will be called on an empty queue).
 */
public class ImplementQueueusingStacks {
    Stack<Integer> A = new Stack<Integer>();
    Stack<Integer> B = new Stack<Integer>();

    // Push element x to the back of queue.
    public void push(int x) {
        A.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (!B.isEmpty())
            B.pop();
        else {
            while (!A.isEmpty()) {
                B.push(A.peek());
                A.pop();
            }
            B.pop();
        }
    }

    // Get the front element.
    public int peek() {
        if (!B.isEmpty())
            return B.peek();
        else {
            while (!A.isEmpty()) {
                B.push(A.peek());
                A.pop();
            }
            return B.peek();
        }
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }
}
