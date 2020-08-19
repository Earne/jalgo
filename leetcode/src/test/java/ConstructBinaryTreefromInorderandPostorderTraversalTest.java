import org.junit.Test;

/**
 * @author gengyuanzhen
 */
public class ConstructBinaryTreefromInorderandPostorderTraversalTest {

    @Test
    public void buildTree() {
        TreeNode root = new ConstructBinaryTreefromInorderandPostorderTraversal().buildTreeIterative(new int[]{9, 3, 15, 20, 7},
                new int[]{9, 15, 7, 20, 3});
       TreeNode.preOrderPrintTree(root);
        System.out.println();
       TreeNode.inOrderPrintTree(root);
    }
}
