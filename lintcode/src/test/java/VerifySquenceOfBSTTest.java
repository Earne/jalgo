import org.junit.Test;

public class VerifySquenceOfBSTTest {

    @Test
    public void testVerifySquenceOfBST() throws Exception {
        VerifySquenceOfBST s = new VerifySquenceOfBST();
        System.out.println(s.verifySquenceOfBST(new int[]{2, 5, 7, 6, 1}));
        System.out.println(s.verifySquenceOfBST(new int[]{7, 4, 6, 5}));
    }
}