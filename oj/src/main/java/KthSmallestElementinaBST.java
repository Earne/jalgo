/**
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 * <p>
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 * <p>
 * Follow up:
 * What if the BST is modified (insert/delete operations) often and
 * you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?
 * <p>
 * Hint:
 * <p>
 * Try to utilize the property of a BST.
 * What if you could modify the BST node's structure?
 * The optimal runtime complexity is O(height of BST).
 */
public class KthSmallestElementinaBST {
    public int kthSmallest(TreeNode root, int k) {
        int leftCount = count(root.left);

        if (k == leftCount + 1)
            return root.val;
        else if (k <= leftCount)
            return kthSmallest(root.left, k);
        else if (k > leftCount + 1)
            return kthSmallest(root.right, k - 1 - leftCount);

        return -1;
    }

    private int count(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + count(root.left) + count(root.right);
    }
}
