import org.junit.Test;

import java.util.List;

public class PascalsTriangleTest {

    @Test
    public void testGenerate() throws Exception {
        PascalsTriangle s = new PascalsTriangle();
        for (List<Integer> l : s.generate(5)) {
            for (Integer i : l)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}