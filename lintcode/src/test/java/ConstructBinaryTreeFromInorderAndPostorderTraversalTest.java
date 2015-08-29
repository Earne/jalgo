import org.junit.Test;

public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

    @Test
    public void testBuildTree() throws Exception {
        ConstructBinaryTreeFromInorderAndPostorderTraversal s = new
                ConstructBinaryTreeFromInorderAndPostorderTraversal();
        TreeNode tree = s.buildTree(new int[]{1, 2, 3}, new int[]{1, 3, 2});
        TreeNode.preOrderPrintTree(tree);
        System.out.println();
        TreeNode.inOrderPrintTree(tree);
    }
}