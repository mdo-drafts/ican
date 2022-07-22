package solved.p_10_backtracking.nc076_M_06_79_Word_Search.my_bad_01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Time Limit Exceeded
public class Solution {

    Set<List<Integer>> visited = new HashSet<>();

    int[][] coords = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (backtrack(0, i, j, board, word)) return true;
            }
        }
        return false;
    }

    private boolean backtrack(int p, int i, int j, char[][] board, String word) {
        if (word.length() - 1 < p) return true;
        if (i < 0 || j < 0) return false;
        if (visited.contains(List.of(i, j))) return false;
        if (board.length - 1 < i || board[i].length - 1 < j) return false;
        if (word.charAt(p) != board[i][j]) return false;

        boolean res = false;
        p++;
        for (int[] coord : coords) {
            visited.add(List.of(i, j));
            res = res || backtrack(p, i + coord[0], j + coord[1], board, word);
            visited.remove(List.of(i, j));
        }
        return res;
    }
}
