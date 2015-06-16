import java.util.ArrayList;
import java.util.List;

/**
 *  Given n pairs of parentheses,
 *  write a function to generate all combinations of well-formed parentheses.
 *  For example, given n = 3, a solution set is:
 *  "((()))", "(()())", "(())()", "()(())", "()()()"
 */
public class GenerateParentheses {
    List<String> result = new ArrayList<String>();

    public List<String> generateParenthesis(int n) {
        helper("", n, n);
        return result;
    }

    private void helper(String s, int ln, int rn) {
        if (ln == 0 && rn == 0)
            result.add(s);
        else {
            if (ln > 0)
                helper(s + "(", ln - 1, rn);
            if (rn > 0 && ln < rn)
                helper(s + ")", ln, rn - 1);
        }
    }
}
