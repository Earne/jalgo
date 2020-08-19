/**
 * Definition for a binary tree node.
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public static void preOrderPrintTree(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.val + " ");
        preOrderPrintTree(node.left);
        preOrderPrintTree(node.right);
    }

    public static void inOrderPrintTree(TreeNode node) {
        if (node == null)
            return;
        inOrderPrintTree(node.left);
        System.out.print(node.val + " ");
        inOrderPrintTree(node.right);
    }

    @Override
    public String toString() {
        String lStr = "<" + (left == null ? "N" : left.val) + ",";
        String rStr = (right == null ? "N" : right.val) + ">";
        return val + lStr + rStr ;
    }
}