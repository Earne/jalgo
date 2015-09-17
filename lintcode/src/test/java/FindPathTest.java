import org.junit.Test;

/**
 * Created by earne on 9/16/15.
 */
public class FindPathTest {

    @Test
    public void testFindPath() throws Exception {
        FindPath s = new FindPath();
//        assertEquals();
        BinaryTree tree = new BinaryTree(new Integer[]{10, 5, 12, 4, 7});
        System.out.println(s.FindPath(tree.getRoot(), 22));
    }
}