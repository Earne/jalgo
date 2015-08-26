import org.junit.Test;

public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    @Test
    public void testBuildTree() throws Exception {
        ConstructBinaryTreeFromPreorderAndInorderTraversal s = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
        TreeNode root = s.buildTree(new int[]{4, 3, 1, 2}, new int[]{1, 2, 3, 4});
        TreeNode.preOrderPrintTree(root);
        System.out.println("\n***");
        TreeNode.inOrderPrintTree(root);
    }
}