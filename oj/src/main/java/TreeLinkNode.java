/**
 * Created by earne on 6/11/15.
 */
public class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;

    public TreeLinkNode(int val) {
        this.val = val;
    }

    public TreeLinkNode(int val, TreeLinkNode left, TreeLinkNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
