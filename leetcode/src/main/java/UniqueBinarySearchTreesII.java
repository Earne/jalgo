import java.util.LinkedList;
import java.util.List;

/**
 * Given n, generate all structurally unique BST's (binary search trees) that store values 1...n.
 * <p>
 * For example,
 * Given n = 3, your program should return all 5 unique BST's shown below.
 * <p>
 * 1         3     3      2      1
 * \       /     /      / \      \
 * 3     2     1      1   3      2
 * /     /       \                 \
 * 2     1         2                 3
 */
public class UniqueBinarySearchTreesII {
    public List<TreeNode> generateTrees(int n) {
        return helper(1, n);
    }

    private List<TreeNode> helper(int start, int end) {
        List<TreeNode> res = new LinkedList<TreeNode>();

        if (start > end) {
            res.add(null);
            return res;
        }

        for (int i = start; i <= end; ++i) {
            List<TreeNode> leftSub = helper(start, i - 1);
            List<TreeNode> rightSub = helper(i + 1, end);

            for (TreeNode left : leftSub)
                for (TreeNode right : rightSub) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
        }

        return res;
    }

    // TODO add DP solution
}
