package solved.p_11_graphs.nc084_M_05_130_Surrounded_Regions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    boolean notSurrounded = false;

    public void solve(char[][] board) {

        Set<List<Integer>> visited = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (visited.contains(List.of(i, j))) continue;
                if (board[i][j] == 'O') {
                    Set<List<Integer>> currVisited = new HashSet<>();
                    dfs(i, j, currVisited, board);
                    if (notSurrounded) {
                        visited.addAll(currVisited);
                        notSurrounded = false;
                    } else {
                        filp(board, currVisited);
                    }
                }
            }
        }
    }

    private void filp(char[][] board, Set<List<Integer>> currVisited) {
        for (List<Integer> pair : currVisited) {
            board[pair.get(0)][pair.get(1)] = 'X';
        }
    }

    private void dfs(int i, int j, Set<List<Integer>> currVisited, char[][] board) {
        if (i < 0 || j < 0 || board.length - 1 < i || board[i].length - 1 < j) {
            notSurrounded = true;
            return;
        }
        if (board[i][j] == 'X') return;
        if (currVisited.contains(List.of(i, j))) return;
        currVisited.add(List.of(i, j));

        dfs(i + 1, j, currVisited, board);
        dfs(i - 1, j, currVisited, board);
        dfs(i, j + 1, currVisited, board);
        dfs(i, j - 1, currVisited, board);
    }
}
