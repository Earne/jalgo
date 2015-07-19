import org.junit.Test;

public class BinarySearchTreeIteratorTest {
    @Test
    public void testHasNext() throws Exception {
        BinaryTree ta = new BinaryTree(new Integer[]{5, 1, 9, null, 3, 8, null, null, null, 2, 4, 7});

        BinarySearchTreeIterator iter = new BinarySearchTreeIterator(ta.getRoot());

        while (iter.hasNext())
            System.out.println(iter.next());
    }
}