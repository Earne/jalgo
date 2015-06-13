/**
 * Created by earne on 6/10/15.
 */
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        next = null;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode(int[] nums) {
        this.val = nums[0];
        ListNode cur = this;
        for (int i = 1; i < nums.length; i++) {
            cur.setNext(new ListNode(nums[i]));
            cur = cur.next;
        }
    }

}
