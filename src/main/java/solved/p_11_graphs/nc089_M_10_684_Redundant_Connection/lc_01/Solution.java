package solved.p_11_graphs.nc089_M_10_684_Redundant_Connection.lc_01;

public class Solution {

    int[] parent;

    public int[] findRedundantConnection(int[][] edges) {

        int m = edges.length;
        parent = new int[m + 1];
        for (int i = 0; i < m; i++) parent[i] = i;
        for (int[] edge : edges) {
            if (!union(edge[0], edge[1])) return edge;
        }
        return new int[0];
    }

    private boolean union(int i1, int i2) {
        int p1 = find(i1);
        int p2 = find(i2);
        if (p1 == p2) return false;
        parent[p1] = p2;

        return true;
    }

    private int find(int i) {
        while (i != parent[i]) {
            i = parent[i];
            parent[i] = parent[parent[i]];
        }
        return i;
    }
}
