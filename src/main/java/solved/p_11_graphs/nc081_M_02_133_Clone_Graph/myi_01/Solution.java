package solved.p_11_graphs.nc081_M_02_133_Clone_Graph.myi_01;

import common.graphs.lc_133_clone_graph.Node;

import java.util.*;

public class Solution {

    public Node cloneGraph(Node node) {

        if (node == null) return null;

        Map<Node, Node> map = new HashMap<>();

        Set<Node> visited = new HashSet<>();

        Queue<Node> queue = new LinkedList<>();

        queue.add(node);

        while (!queue.isEmpty()) {
            Node currNode = queue.poll();
            if (visited.contains(currNode)) continue;
            Node cloneNode = map.containsKey(currNode) ? map.get(currNode) : new Node(currNode.val);
            map.put(currNode, cloneNode);
            for (Node neighbor : currNode.neighbors) {
                if (!map.containsKey(neighbor)) {
                    Node neighborClone = new Node(neighbor.val);
                    map.put(neighbor, neighborClone);
                }
                cloneNode.neighbors.add(map.get(neighbor));
                queue.add(neighbor);
            }
            visited.add(currNode);
        }
        return map.get(node);
    }
}
