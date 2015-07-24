import org.junit.Test;

public class SummaryRangesTest {

    @Test
    public void testSummaryRanges() throws Exception {
        SummaryRanges s = new SummaryRanges();
        for (String string : s.summaryRanges(new int[]{1})) {
            System.out.print(string + " ");
        }
        System.out.println("\n*****");
        for (String string : s.summaryRanges(new int[]{1, 2, 3, 5, 6, 8})) {
            System.out.print(string + " ");
        }
    }
}