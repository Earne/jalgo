import java.util.HashMap;
import java.util.Map;

/**
 * Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.
 * <p>
 * OJ's undirected graph serialization:
 * <p>
 * Nodes are labeled uniquely.
 * We use # as a separator for each node, and ,
 * as a separator for node label and each neighbor of the node.
 * <p>
 * As an example, consider the serialized graph {0,1,2#1,2#2,2}.
 * <p>
 * The graph has a total of three nodes, and therefore contains three parts as separated by #.
 * <p>
 * First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
 * Second node is labeled as 1. Connect node 1 to node 2.
 * Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
 * <p>
 * Visually, the graph looks like the following:
 * <p>
 * 1
 * / \
 * /   \
 * 0 --- 2
 * / \
 * \_/
 */
public class CloneGraph {
    private Map<Integer, UndirectedGraphNode> map = new HashMap<Integer, UndirectedGraphNode>();

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null)
            return null;
        if (map.containsKey(node.label))
            return map.get(node.label);

        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        map.put(clone.label, clone);

        for (UndirectedGraphNode nei : node.neighbors)
            clone.neighbors.add(cloneGraph(nei));

        return clone;
    }
}
