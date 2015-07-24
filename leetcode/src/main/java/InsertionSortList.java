import java.util.ArrayList;
import java.util.List;

/**
 * Sort a linked list using insertion sort.
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Integer[] array = list.toArray(new Integer[list.size()]);
        insertSort(array);
        ListNode fake = new ListNode(-1);
        ListNode node = fake;
        for (Integer val : array) {
            node.next = new ListNode(val);
            node = node.next;
        }
        return fake.next;
    }

    private void insertSort(Integer[] array) {
        for (int i = 1; i < array.length; i++) {
            int cur = array[i];
            int j = i;
            for (; j > 0 && array[j - 1] > cur; j--) {
                array[j] = array[j - 1];
            }
            array[j] = cur;
        }
    }

    // TODO refactor this
    public ListNode insertionSortList2(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode cur = head.next;
        ListNode next = head.next.next;
        head.next = null;
        while (cur != null) {
            ListNode beg = fake;
            while (beg.next != null && beg.next.val < cur.val) {
                beg = beg.next;
            }
            ListNode tmp = beg.next;
            beg.next = cur;
            cur.next = tmp;
            cur = next;
            if (next != null)
                next = next.next;
        }
        return fake.next;
    }


}
