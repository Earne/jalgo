import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * There are a total of n courses you have to take, labeled from 0 to n - 1.
 * <p>
 * Some courses may have prerequisites,
 * for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]
 * <p>
 * Given the total number of courses and a list of prerequisite pairs,
 * return the ordering of courses you should take to finish all courses.
 * <p>
 * There may be multiple correct orders, you just need to return one of them.
 * If it is impossible to finish all courses, return an empty array.
 * <p>
 * For example:
 * <p>
 * 2, [[1,0]]
 * <p>
 * There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0. So the correct course order is [0,1]
 * <p>
 * 4, [[1,0],[2,0],[3,1],[3,2]]
 * <p>
 * There are a total of 4 courses to take.
 * To take course 3 you should have finished both courses 1 and 2.
 * Both courses 1 and 2 should be taken after you finished course 0.
 * So one correct course order is [0,1,2,3]. Another correct ordering is[0,2,1,3].
 * <p>
 * Note:
 * The input prerequisites is a graph represented by a list of edges,
 * not adjacency matrices. Read more about how a graph is represented.
 * <p>
 * click to show more hints.
 * Hints:
 * <p>
 * This problem is equivalent to finding the topological order in a directed graph.
 * If a cycle exists,
 * no topological ordering exists and therefore it will be impossible to take all courses.
 * Topological Sort via DFS - A great video tutorial (21 minutes) on
 * Coursera explaining the basic concepts of Topological Sort.
 * Topological sort could also be done via BFS.
 */
public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        PriorityQueue<NumFreqPos> heap = new PriorityQueue<>((a, b) -> {
            if (a.freq != b.freq) {
                return b.freq - a.freq;
            } else {
                return b.pos - a.pos;
            }
        });
        int[] result = new int[numCourses];
        int cur = 0;
        int[] inDegree = new int[numCourses];
        for (int[] i : prerequisites)
            inDegree[i[0]]++;

        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0)
                queue.add(i);
        }

        while (!queue.isEmpty()) {
            result[cur++] = queue.peek();
            queue.remove();
            for (int[] i : prerequisites)
                if (i[1] == result[cur - 1]) {
                    if (--inDegree[i[0]] == 0)
                        queue.add(i[0]);
                }
        }

        if (cur != numCourses)
            return new int[]{};
        return result;
    }
}

class NumFreqPos {
    int num;
    int freq;
    int pos;

    public NumFreqPos(int num, int freq, int pos) {
        this.num = num;
        this.freq = freq;
        this.pos = pos;
    }
}
