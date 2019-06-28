package ernest;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * <p>
 * Note that an empty string is also considered valid.
 * <p>
 * Example 1:
 * <p>
 * Input: "()"
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: "()[]{}"
 * Output: true
 * <p>
 * Example 3:
 * <p>
 * Input: "(]"
 * Output: false
 * <p>
 * Example 4:
 * <p>
 * Input: "([)]"
 * Output: false
 * <p>
 * Example 5:
 * <p>
 * Input: "{[]}"
 * Output: true
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' ||
                    c == '[' ||
                    c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character peek = stack.peek();
                if ((peek == '(' && c == ')') ||
                        (peek == '[' && c == ']') ||
                        (peek == '{' && c == '}')) {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}
