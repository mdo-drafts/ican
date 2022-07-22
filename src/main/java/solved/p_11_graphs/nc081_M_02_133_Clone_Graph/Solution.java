package solved.p_11_graphs.nc081_M_02_133_Clone_Graph;

import common.graphs.lc_133_clone_graph.Node;

import java.util.*;

public class Solution {

    public Node cloneGraph(Node node) {

        Map<Node, Node> map = new HashMap<>();

        Queue<Node> queue = new LinkedList<>();

        queue.add(node);

        while (!queue.isEmpty()) {
            Node currNode = queue.poll();
            if (map.containsKey(currNode)) continue;
            Node newNode = new Node(currNode.val);
            map.put(currNode, newNode);
            //TODO: remember, not 'for' loop, use 'addAll'
            queue.addAll(currNode.neighbors);
        }

        queue.add(node);
        Set<Node> visited = new HashSet<>();
        while (!queue.isEmpty()) {
            Node currNode = queue.poll();
            if (visited.contains(currNode)) continue;
            Node cloneNode = map.get(currNode);
            for (Node neighbor : currNode.neighbors) {
                cloneNode.neighbors.add(map.get(neighbor));
                queue.add(neighbor);
            }
            visited.add(currNode);
        }
        return map.get(node);
    }
}
