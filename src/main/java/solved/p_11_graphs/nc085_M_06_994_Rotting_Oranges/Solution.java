package solved.p_11_graphs.nc085_M_06_994_Rotting_Oranges;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public int orangesRotting(int[][] grid) {

        int freshCount = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) freshCount++;
            }
        }

        int time = 0;
        Set<List<Integer>> visited = new HashSet<>();
        while (0 < freshCount) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (visited.contains(List.of(i, j))) continue;
                    if (grid[i][j] == 2) {
                        if (0 < i && grid[i - 1][j] == 1) {
                            visited.add(List.of(i - 1, j));
                        } if (0 < j && grid[i][j - 1] == 1) {
                            visited.add(List.of(i, j - 1));
                        } if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                            visited.add(List.of(i + 1, j));
                        } if (j < grid[0].length - 1 && grid[i][j + 1] == 1) {
                            visited.add(List.of(i, j + 1));
                        }
                    }
                }
            }
            if (visited.isEmpty()) {
                time = -1;
                break;
            }
            time++;
            freshCount -= visited.size();
            for (List<Integer> pair : visited) {
                grid[pair.get(0)][pair.get(1)] = 2;
            }
            visited = new HashSet<>();
        }
        return time;
    }
}
