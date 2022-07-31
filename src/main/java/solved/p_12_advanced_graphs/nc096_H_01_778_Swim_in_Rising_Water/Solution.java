package solved.p_12_advanced_graphs.nc096_H_01_778_Swim_in_Rising_Water;

import java.util.*;

public class Solution {

    public int swimInWater(int[][] grid) {

        int n = grid.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(arr -> arr[0]));

        pq.add(new int[]{grid[0][0], 0, 0});

        Set<List<Integer>> visited = new HashSet<>();

        int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        visited.add(List.of(0, 0));

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int t = curr[0];
            int r = curr[1];
            int c = curr[2];

            if (r == n - 1 && c == n - 1) return t;
            for (int[] dir : dirs) {
                int neiR = r + dir[0];
                int neiC = c + dir[1];

                if (neiR < 0 || neiC < 0 || n - 1 < neiR || n - 1 < neiC) continue;
                if (visited.contains(List.of(neiR, neiC))) continue;

                visited.add(List.of(neiR, neiC));

                pq.add(new int[]{Math.max(t, grid[neiR][neiC]), neiR, neiC});
            }
        }
        return -1;
    }
}
