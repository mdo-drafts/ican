package solved.p_11_graphs.nc092_H_13_127_Word_Ladder.my_bad_01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Time Limit Exceeded
public class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) return 0;

        set.add(beginWord);
        int result = bfs(1, beginWord, endWord, set);
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    private int bfs(int count, String curr, String endWord, Set<String> set) {

        set.remove(curr);
        Set<String> candidates = new HashSet<>();
        for (String word : set) {
            if (isValid(curr, word)) candidates.add(word);
        }
        if (candidates.isEmpty()) return Integer.MAX_VALUE;
        if (candidates.contains(endWord)) return count + 1;

        int res = Integer.MAX_VALUE;
        count++;
        for (String candidate : candidates) {
            int currRes = bfs(count, candidate, endWord, new HashSet<>(set));
            res = Math.min(res, currRes);
        }

        return res;
    }

    private boolean isValid(String curr, String word) {
        int count = 0;
        for (int i = 0; i < curr.length(); i++) {
            if (curr.charAt(i) == word.charAt(i)) count++;
        }
        return (curr.length() - count) <= 1;
    }
}
