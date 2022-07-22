package solved.p_11_graphs.nc080_M_01_200_Number_of_Islands;

public class Solution {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(i, j, grid);
                }
            }
        }
        return count;
    }

    private void dfs(int i, int j, char[][] grid) {
        if (i < 0 || j < 0) return;
        if (grid.length - 1 < i || grid[i].length - 1 < j) return;
        if (grid[i][j] == '0') return;

        grid[i][j] = '0';

        dfs(i + 1, j, grid);
        dfs(i - 1, j, grid);
        dfs(i, j + 1, grid);
        dfs(i, j - 1, grid);
    }
}
