package solved.p_10_backtracking.nc079_H_09_51_N_Queens;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    Set<Integer> columns = new HashSet<>();
    Set<Integer> pDiags = new HashSet<>();
    Set<Integer> nDiags = new HashSet<>();

    List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(".");
            }
            board.add(row);
        }
        backtrack(0, n, board);
        return result;
    }


    private void backtrack(int r, int n, List<List<String>> board) {
        if (r == n) {
            List<String> currBoard = new ArrayList<>();
            for (List<String> row : board) {
                String currRow = String.join("", row);
                currBoard.add(currRow);
            }
            result.add(currBoard);
        }

        for (int c = 0; c < n; c++) {
            if (columns.contains(c) || pDiags.contains(r + c) || nDiags.contains(r - c)) continue;
            columns.add(c);
            pDiags.add(r + c);
            nDiags.add(r - c);
            board.get(r).set(c, "Q");
            backtrack(r + 1, n, board);
            columns.remove(c);
            pDiags.remove(r + c);
            nDiags.remove(r - c);
            board.get(r).set(c, ".");
        }
    }
}

