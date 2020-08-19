import org.junit.Test;

/**
 * @author gengyuanzhen
 */
public class TaskSchedulerTest {

    @Test
    public void leastInterval() {
        String res1 = new TaskScheduler().leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2);
        System.out.println(res1);
    }
}
