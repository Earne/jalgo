import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author gengyuanzhen
 */
public class WordSearchTest {

    @Test
    public void exist() {
        boolean res1 = new WordSearch().exist(new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        }, "ABCCED");
        assertTrue(res1);
    }
}
