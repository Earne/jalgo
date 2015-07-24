import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BinaryTreeRightSideViewTest {

    @Test
    public void testRightSideView() throws Exception {
        BinaryTree a = new BinaryTree(new Integer[]{1, 2, 3, null, 5, null, 4});
        BinaryTree b = new BinaryTree(new Integer[]{1, 2, 3, 4});

        BinaryTreeRightSideView s = new BinaryTreeRightSideView();
        assertEquals(Arrays.asList(new Integer[]{1, 3, 4}), s.rightSideView(a.getRoot()));
        assertEquals(Arrays.asList(new Integer[]{1, 3, 4}), s.rightSideView(b.getRoot()));

        assertEquals(Arrays.asList(new Integer[]{1, 3, 4}), s.rightSideView2(a.getRoot()));
        assertEquals(Arrays.asList(new Integer[]{1, 3, 4}), s.rightSideView2(b.getRoot()));
    }
}