import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/11/15.
 */
public class PopulatingNextRightPointersinEachNodeTest {

    @Test
    public void testConnect() throws Exception {
        TreeLinkNode a4 = new TreeLinkNode(4, null, null);
        TreeLinkNode a5 = new TreeLinkNode(5, null, null);
        TreeLinkNode a6 = new TreeLinkNode(6, null, null);
        TreeLinkNode a7 = new TreeLinkNode(7, null, null);
        TreeLinkNode a2 = new TreeLinkNode(2, a4, a5);
        TreeLinkNode a3 = new TreeLinkNode(3, a6, a7);
        TreeLinkNode a1 = new TreeLinkNode(1, a2, a3);
        PopulatingNextRightPointersinEachNode s = new PopulatingNextRightPointersinEachNode();
        s.connect(a1);
        assertEquals(null, a1.next);
        assertEquals(a3, a2.next);
        assertEquals(a6, a5.next);
    }
}