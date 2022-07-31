package solved.p_11_graphs.nc092_H_13_127_Word_Ladder;

import java.util.*;

public class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Map<String, Set<String>> map = new HashMap<>();

        wordList.add(beginWord);

        for (String word : wordList) {
            for (int i = 0; i < word.length(); i++) {
                String pattern = word.substring(0, i) + '*' + word.substring(i + 1);
                map.computeIfAbsent(pattern, c -> new HashSet<>());
                map.get(pattern).add(word);
            }
        }

        Set<String> visited = new HashSet<>();

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        visited.add(beginWord);

        int res = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            //TODO: remember - do NOT put 'queue.size()' into for loop directly, as 'size' will change and not stay fixed.
            for (int i = 0; i < size; i++) {
                String curr = queue.poll();
                //TODO: remember, String comparison only with '.equals'
                if (Objects.equals(curr, endWord)) return res;
                for (int j = 0; j < curr.length(); j++) {
                    String pattern = curr.substring(0, j) + '*' + curr.substring(j + 1);
                    for (String neighbor : map.get(pattern)) {
                        if (!visited.contains(neighbor)) {
                            queue.add(neighbor);
                            visited.add(neighbor);
                        }
                    }
                }
            }
            ++res;
        }
        return 0;
    }

}
