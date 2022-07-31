package solved.p_11_graphs.nc091_M_12_261_Graph_Valid_Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    Set<Integer> visited = new HashSet<>();

    public boolean validTree(int n, int[][] edges) {
        if (n == edges.length) return false;

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) adjList.add(new ArrayList<>());
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        return dfs(0, -1, adjList) && visited.size() == n;
    }

    private boolean dfs(int curr, int from, List<List<Integer>> adjList) {
        if (visited.contains(curr)) return false;
        visited.add(curr);
        for (int num : adjList.get(curr)) {
            if (num != from) {
                if (!dfs(num, curr, adjList)) return false;
            }
        }
        return true;
    }
}
