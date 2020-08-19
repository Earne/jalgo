import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author gengyuanzhen
 */
public class DistributeCandiesToPeopleTest {

    @Test
    public void distributeCandies() {
        int[] res = new DistributeCandiesToPeople().distributeCandies(91, 4);
        System.out.println(res);
    }
}
