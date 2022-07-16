package unsolved.p_08_tries.nc063_H_03_212_Word_Search_II;

import java.util.*;

public class Solution {

    class TrieNode {

        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEnd;

        private void addWord(String word) {
            TrieNode curr = this;
            for (char c : word.toCharArray()) {
                curr.children.computeIfAbsent(c, k -> new TrieNode());
                curr = curr.children.get(c);
            }
            curr.isEnd = true;
        }
    }

    Set<String> result = new HashSet<>();

    Set<List<Integer>> visited = new HashSet<>();

    int[][] coords = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) root.addWord(word);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                dfs(i, j, board, "", root);
            }
        }
        return new ArrayList<>(result);
    }

    private void dfs(int i, int j, char[][] board, String word, TrieNode node) {
        if (i < 0 || j < 0) return;
        if (board.length - 1 < i || board[i].length - 1 < j) return;
        if (visited.contains(List.of(i, j)) || !node.children.containsKey(board[i][j])) return;
        visited.add(List.of(i, j));
        node = node.children.get(board[i][j]);
        word += board[i][j];
        if (node.isEnd) result.add(word);
        for (int[] coord : coords) {
            dfs(i + coord[0], j + coord[1], board, word, node);
        }
        visited.remove(List.of(i, j));
    }

}

