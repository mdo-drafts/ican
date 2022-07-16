package unsolved.p_08_tries.nc063_H_03_212_Word_Search_II.my_bad_01;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    int[][] coords = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    boolean[][] visited;

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            visited = new boolean[board.length][board[0].length];
            if (isWordPresent(board, word)) result.add(word);
        }
        return result;
    }

    private boolean isWordPresent(char[][] board, String word) {
        char first = word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (first == board[i][j]) {
                    if (boardContainsAllLetters(i, j, 1, board, word)) return true;
                }
            }
        }
        return false;
    }

    private boolean boardContainsAllLetters(int i, int j, int startIndex, char[][] board, String word) {
        for (int ind = startIndex; ind < word.length(); ind++) {
            char toFind = word.charAt(ind);
            boolean wasFound = false;
            for (int[] coord : coords) {
                if (charIsPresent(i + coord[0], j + coord[1], toFind, board)) {
                    wasFound = true;
                    boardContainsAllLetters(i + coord[0], j + coord[1], ind + 1, board, word);
                }
            }
            return wasFound;
        }
        return true;
    }

    private boolean charIsPresent(int i, int j, char toFind, char[][] board) {
        if (i < 0 || j < 0) return false;
        if (board.length - 1 < i || board[i].length - 1 < j) return false;
        if (visited[i][j]) return false;
        if (board[i][j] != toFind) return false;
        visited[i][j] = true;
        return true;
    }
}

