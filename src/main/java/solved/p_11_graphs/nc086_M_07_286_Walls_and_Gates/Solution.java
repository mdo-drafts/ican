package solved.p_11_graphs.nc086_M_07_286_Walls_and_Gates;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public void wallsAndGates(int[][] rooms) {

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j] == 0) {
                    dfs(0, i, j, rooms);

                }
            }
        }
    }

    private void dfs(int count, int i, int j, int[][] rooms) {
        if (i < 0 || j < 0) return;
        if (rooms.length - 1 < i || rooms[i].length - 1 < j) return;
        if (rooms[i][j] < count) return;

        rooms[i][j] = count;
        dfs(count + 1, i + 1, j, rooms);
        dfs(count + 1, i - 1, j, rooms);
        dfs(count + 1, i, j + 1, rooms);
        dfs(count + 1, i, j - 1, rooms);
    }
}
