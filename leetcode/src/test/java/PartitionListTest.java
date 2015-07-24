import org.junit.Test;

public class PartitionListTest {

    @Test
    public void testPartition() throws Exception {
        ListNode a = new ListNode(new int[]{1, 4, 3, 2, 5, 2});
        ListNode b = new ListNode(new int[]{2, 1});
        PartitionList s = new PartitionList();
        a = s.partition(a, 3);
        b = s.partition(b, 2);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
        System.out.println("****");
        while (b != null) {
            System.out.println(b.val);
            b = b.next;
        }
    }
}