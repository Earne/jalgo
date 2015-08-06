/**
 * Follow up for problem "Populating Next Right Pointers in Each Node".
 * <p/>
 * What if the given tree could be any binary tree? Would your previous solution still work?
 * <p/>
 * Note:
 * <p/>
 * You may only use constant extra space.
 * <p/>
 * For example,
 * Given the following binary tree,
 * <p/>
 * 1
 * /  \
 * 2    3
 * / \    \
 * 4   5    7
 * <p/>
 * After calling your function, the tree should look like:
 * <p/>
 * 1 -> NULL
 * /  \
 * 2 -> 3 -> NULL
 * / \    \
 * 4-> 5 -> 7 -> NULL
 */
public class PopulatingNextRightPointersinEachNodeII {
    public void connect(TreeLinkNode root) {
        while (root != null) {
            TreeLinkNode fakeLevelHead = new TreeLinkNode(0);
            TreeLinkNode currentNode = fakeLevelHead;
            while (root != null) {
                if (root.left != null) {
                    currentNode.next = root.left;
                    currentNode = currentNode.next;
                }
                if (root.right != null) {
                    currentNode.next = root.right;
                    currentNode = currentNode.next;
                }
                root = root.next;
            }
            root = fakeLevelHead.next;
        }
    }
}
