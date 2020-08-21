import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SuppressWarnings("NonAsciiCharacters")
public class TreeTraversalTest {
    /**
     * Input: [1,null,2,3]
     * 1
     * \
     * 2
     * /
     * 3
     * Input: "[1,2,3,null,null,4,5]"
     * 1
     * / \
     * 2   3
     * / \
     * 4   5
     */
    private final TreeNode rootA = new BinaryTree(new Integer[]{1, null, 2, null, null, 3}).getRoot();
    private final TreeNode rootB = new BinaryTree(new Integer[]{1, 2, 3, null, null, 4, 5}).getRoot();
    private final List<Integer> aPreOrder = Arrays.asList(1, 2, 3);
    private final List<Integer> aInOrder = Arrays.asList(1, 3, 2);
    private final List<Integer> aPostOrder = Arrays.asList(3, 2, 1);
    private final List<Integer> bPreOrder = Arrays.asList(1, 2, 3, 4, 5);
    private final List<Integer> bInOrder = Arrays.asList(2, 1, 4, 3, 5);
    private final List<Integer> bPostOrder = Arrays.asList(2, 4, 5, 3, 1);

    private final TreeTraversal traversal = new TreeTraversal();


    @Test
    public void 测试前序遍历_递归() {
        assertEquals(aPreOrder, traversal.preOrderRecursive(rootA));
        assertEquals(bPreOrder, traversal.preOrderRecursive(rootB));
    }

    @Test
    public void 测试前序遍历_递归_不放入null() {
        assertEquals(aPreOrder, traversal.preOrderRecursiveNoNull(rootA));
        assertEquals(bPreOrder, traversal.preOrderRecursiveNoNull(rootB));
    }

    @Test
    public void 测试前序遍历_非递归_借助Task_有Null模拟递归时堆栈的情况() {
        assertEquals(aPreOrder, traversal.preOrderTask(rootA));
        assertEquals(bPreOrder, traversal.preOrderTask(rootB));
    }

    @Test
    public void 测试前序遍历_非递归_借助Task_NoNull模拟递归时堆栈的情况() {
        assertEquals(aPreOrder, traversal.preOrderTaskNoNull(rootA));
        assertEquals(bPreOrder, traversal.preOrderTaskNoNull(rootB));
    }

    @Test
    public void 测试前序_非递归_不放入null模拟递归时堆栈的情况() {
        assertEquals(aPreOrder, traversal.preOrderIterNoNull(rootA));
        assertEquals(bPreOrder, traversal.preOrderIterNoNull(rootB));
    }

    @Test
    public void 测试前序_非递归_放入null模拟递归时堆栈的情况() {
        assertEquals(aPreOrder, traversal.preOrderIterNull(rootA));
        assertEquals(bPreOrder, traversal.preOrderIterNull(rootB));
    }

    @Test
    public void 测试中序遍历_非递归_借助Task_有Null模拟递归时堆栈的情况() {
        assertEquals(aInOrder, traversal.inOrderTask(rootA));
        assertEquals(bInOrder, traversal.inOrderTask(rootB));
    }

    @Test
    public void 测试中序遍历_非递归_借助Task_无Null模拟递归时堆栈的情况() {
        assertEquals(aInOrder, traversal.inOrderTaskNoNull(rootA));
        assertEquals(bInOrder, traversal.inOrderTaskNoNull(rootB));
    }

    @Test
    public void 测试中序_非递归_不放入null模拟递归时堆栈的情况() {
        assertEquals(aInOrder, traversal.inOrderIterNoNull(rootA));
        assertEquals(bInOrder, traversal.inOrderIterNoNull(rootB));
    }


    @Test
    public void 测试后序_非递归_不放入null模拟递归时堆栈的情况() {
        assertEquals(aPostOrder, traversal.postOrderIterNotNull(rootA));
        assertEquals(bPostOrder, traversal.postOrderIterNotNull(rootB));
    }
}
