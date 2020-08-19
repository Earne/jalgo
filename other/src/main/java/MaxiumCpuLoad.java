import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxiumCpuLoad {
    public static int findMaxCPULoad(List<Job> jobs) {
        if (jobs == null || jobs.isEmpty()) {
            return -1;
        }
        int res = 0, cur = 0;
        jobs.sort(Comparator.comparingInt(a -> a.start));

        Queue<Job> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a.end));
        for (Job job : jobs) {
            while (!queue.isEmpty() && queue.peek().end < job.start) {
                cur -= (queue.remove().cpuLoad);
            }
            queue.add(job);
            cur += job.cpuLoad;
            res = Math.max(res, cur);
        }

        return res;
    }

    public static void main(String[] args) {
        List<Job> input = new ArrayList<Job>(Arrays.asList(new Job(1, 4, 3), new Job(2, 5, 4), new Job(7, 9, 6)));
        System.out.println("Maximum CPU load at any time: " + findMaxCPULoad(input));
        input = new ArrayList<Job>(Arrays.asList(new Job(6, 7, 10), new Job(2, 4, 11), new Job(8, 12, 15)));
        System.out.println("Maximum CPU load at any time: " + findMaxCPULoad(input));
        input = new ArrayList<Job>(Arrays.asList(new Job(1, 4, 2), new Job(2, 4, 1), new Job(3, 6, 5)));
        System.out.println("Maximum CPU load at any time: " + findMaxCPULoad(input));
    }
}

class Job {
    int start;
    int end;
    int cpuLoad;

    public Job(int start, int end, int cpuLoad) {
        this.start = start;
        this.end = end;
        this.cpuLoad = cpuLoad;
    }
}
