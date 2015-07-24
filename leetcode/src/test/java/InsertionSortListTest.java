import org.junit.Test;

public class InsertionSortListTest {

    @Test
    public void testInsertionSortList() throws Exception {
        InsertionSortList s = new InsertionSortList();
        ListNode a = new ListNode(new int[]{1, 3, 2, 5, 4});
        a = s.insertionSortList(a);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }
}