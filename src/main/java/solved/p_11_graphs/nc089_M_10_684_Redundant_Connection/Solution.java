package solved.p_11_graphs.nc089_M_10_684_Redundant_Connection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public int[] findRedundantConnection(int[][] edges) {

        List<List<Integer>> adjlist = new ArrayList<>();

        for (int i = 0; i <= edges.length; i++) {
            adjlist.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            if (dfs(new HashSet<>(), edge[0], edge[1], adjlist)) return edge;
            adjlist.get(edge[0]).add(edge[1]);
            adjlist.get(edge[1]).add(edge[0]);
        }
        return new int[0];
    }

    private boolean dfs(Set<Integer> visited, int src, int target, List<List<Integer>> adjlist) {
        if (src == target) return true;
        visited.add(src);
        for (int i : adjlist.get(src)) {
            if (!visited.contains(i)) {
                if (dfs(visited, i, target, adjlist)) return true;
            }
        }
        return false;
    }
}
