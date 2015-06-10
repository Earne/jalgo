/**
 * Created by earne on 6/9/15.
 */
public class BinaryTree {
    TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public BinaryTree(Integer[] array) {
        root = insertTreeNode(array, 0);
    }

    private TreeNode insertTreeNode(Integer[] array, int i) {
        if (i < array.length) {
            Integer val = array[i];
            if (val != null) {
                TreeNode node = new TreeNode(val);
                node.left = insertTreeNode(array, i * 2 + 1);
                node.right = insertTreeNode(array, i * 2 + 2);
                return node;
            }
        }
        return null;
    }
}
