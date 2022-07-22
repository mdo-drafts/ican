package solved.p_11_graphs.nc084_M_04_417_Pacific_Atlantic_Water_Flow;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int rows = heights.length, cols = heights[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            dfs(i, 0, Integer.MIN_VALUE, pacific, heights);
            dfs(i, cols - 1, Integer.MIN_VALUE, atlantic, heights);
        }

        for (int j = 0; j < cols; j++) {
            dfs(0, j, Integer.MIN_VALUE, pacific, heights);
            dfs(rows - 1, j, Integer.MIN_VALUE, atlantic, heights);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[i].length; j++) {
                if (pacific[i][j] && atlantic[i][j]) result.add(List.of(i, j));
            }
        }
        return result;
    }

    private void dfs(int i, int j, int prev, boolean[][] ocean, int[][] heights) {
        if (i < 0 || j < 0) return;
        if (heights.length - 1 < i || heights[i].length - 1 < j) return;
        if (ocean[i][j]) return;
        if (heights[i][j] < prev) return;

        ocean[i][j] = true;
        dfs(i + 1, j, heights[i][j], ocean, heights);
        dfs(i - 1, j, heights[i][j], ocean, heights);
        dfs(i, j + 1, heights[i][j], ocean, heights);
        dfs(i, j - 1, heights[i][j], ocean, heights);

    }
}
