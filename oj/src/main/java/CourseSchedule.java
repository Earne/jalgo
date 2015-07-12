import java.util.ArrayList;
import java.util.List;

/**
 * There are a total of n courses you have to take, labeled from 0 to n - 1.
 * <p>
 * Some courses may have prerequisites, for example to take course 0 you have to first take course 1,
 * which is expressed as a pair: [0,1]
 * <p>
 * Given the total number of courses and a list of prerequisite pairs,
 * is it possible for you to finish all courses?
 * <p>
 * For example:
 * <p>
 * 2, [[1,0]]
 * <p>
 * There are a total of 2 courses to take. To take course 1 you should have finished course 0.
 * So it is possible.
 * <p>
 * 2, [[1,0],[0,1]]
 * <p>
 * There are a total of 2 courses to take. To take course 1 you should have finished course 0,
 * and to take course 0 you should also have finished course 1. So it is impossible.
 * <p>
 * Note:
 * The input prerequisites is a graph represented by a list of edges, not adjacency matrices.
 * Read more about how a graph is represented.
 * <p>
 * click to show more hints.
 * Hints:
 * <p>
 * This problem is equivalent to finding if a cycle exists in a directed graph.
 * If a cycle exists,
 * no topological ordering exists and therefore it will be impossible to take all courses.
 * Topological Sort via DFS - A great video tutorial (21 minutes) on
 * Coursera explaining the basic concepts of Topological Sort.
 * Topological sort could also be done via BFS.
 */
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<List<Integer>>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            graph.add(i, new ArrayList<Integer>());
        }

        for (int[] a : prerequisites)
            graph.get(a[0]).add(a[1]);

        boolean[] visited = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!helper(graph, visited, i))
                return false;
        }
        return true;
    }

    private boolean helper(List<List<Integer>> graph, boolean[] visited, int course) {
        if (visited[course])
            return false;

        visited[course] = true;

        for (int i = 0; i < graph.get(course).size(); i++) {
            if (!helper(graph, visited, graph.get(course).get(i)))
                return false;
        }
        visited[course] = false;

        return true;
    }
}
