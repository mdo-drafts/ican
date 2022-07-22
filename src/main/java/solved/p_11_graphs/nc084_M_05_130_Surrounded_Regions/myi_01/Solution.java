package solved.p_11_graphs.nc084_M_05_130_Surrounded_Regions.myi_01;

import java.util.*;

public class Solution {
    List<int[]> tmp = new ArrayList<>();

    public void solve(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'O') {
                    boolean isSurrounded = checkIfSurrounded(i, j, board);
                    if (!isSurrounded) {
                        for (int[] coords : tmp) {
                            board[coords[0]][coords[1]] = 'O';
                        }
                    }
                    tmp = new ArrayList<>();
                }
            }
        }
    }

    private boolean checkIfSurrounded(int i, int j, char[][] board) {
        if (i < 0 || j < 0) return false;
        if (board.length - 1 < i || board[i].length - 1 < j) return false;
        if (board[i][j] == 'X') return true;

        board[i][j] = 'X';
        tmp.add(new int[]{i, j});

        return checkIfSurrounded(i - 1, j, board)
                && checkIfSurrounded(i + 1, j, board)
                && checkIfSurrounded(i, j - 1, board)
                && checkIfSurrounded(i, j + 1, board)
                ;
    }
}
