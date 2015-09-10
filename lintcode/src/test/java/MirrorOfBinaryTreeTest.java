import org.junit.Test;

/**
 * Created by earne on 9/9/15.
 */
public class MirrorOfBinaryTreeTest {

    @Test
    public void testMirrorOfBinaryTree() throws Exception {
        BinaryTree tree = new BinaryTree(new Integer[]{1, null, 2, null, null, 3});
        MirrorOfBinaryTree s = new MirrorOfBinaryTree();
        TreeNode root = s.mirrorOfBinaryTree(tree.getRoot());
        TreeNode.inOrderPrintTree(root);
        TreeNode.preOrderPrintTree(root);
    }
}