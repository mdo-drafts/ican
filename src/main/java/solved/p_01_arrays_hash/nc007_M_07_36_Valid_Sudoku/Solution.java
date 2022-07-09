package solved.p_01_arrays_hash.nc007_M_07_36_Valid_Sudoku;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isValidSudoku(char[][] board) {

        Set<String> set = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    String rowHash = "r_" + i + "_" + board[i][j];
                    if (set.contains(rowHash)) return false;
                    set.add(rowHash);

                    String colHash = "c_" + j + "_" + board[i][j];
                    if (set.contains(colHash)) return false;
                    set.add(colHash);

                    String squareHash = i / 3 + "_" + j / 3 + "_" + board[i][j];
                    if (set.contains(squareHash)) return false;

                    set.add(squareHash);
                }
            }
        }
        return true;
    }
}
