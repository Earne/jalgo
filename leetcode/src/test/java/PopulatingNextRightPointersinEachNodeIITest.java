import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PopulatingNextRightPointersinEachNodeIITest {

    @Test
    public void testConnect() throws Exception {
        TreeLinkNode a8 = new TreeLinkNode(8);
        TreeLinkNode a9 = new TreeLinkNode(9);

        TreeLinkNode a4 = new TreeLinkNode(4, a8, null);
        TreeLinkNode a5 = new TreeLinkNode(5);
        TreeLinkNode a7 = new TreeLinkNode(7, null, a9);

        TreeLinkNode a2 = new TreeLinkNode(2, a4, a5);
        TreeLinkNode a3 = new TreeLinkNode(3, null, a7);

        TreeLinkNode a1 = new TreeLinkNode(1, a2, a3);

        PopulatingNextRightPointersinEachNodeII s = new PopulatingNextRightPointersinEachNodeII();
        s.connect(a1);

        assertEquals(a5, a4.next);
        assertEquals(a7, a5.next);
        assertEquals(a9, a8.next);
    }
}