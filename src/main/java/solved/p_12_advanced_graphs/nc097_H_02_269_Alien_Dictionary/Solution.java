package solved.p_12_advanced_graphs.nc097_H_02_269_Alien_Dictionary;

import java.util.*;

public class Solution {

    public String alienOrder(String[] words) {

        Map<Character, Set<Character>> map = new HashMap<>();

        for(String word : words){
            for(char c : word.toCharArray()){
                map.computeIfAbsent(c, k -> new HashSet<>());
            }
        }


        for (int i = 0; i < words.length - 1; i++) {

            String w1 = words[i];
            String w2 = words[i + 1];

            int minLength = Math.min(w1.length(), w2.length());
            if (w1.length() > w2.length() && w1.substring(0, minLength).equals(w2.substring(0, minLength))) return "";
            for (int j = 0; j < minLength; j++) {
                if (w1.charAt(j) != w2.charAt(j)) {
                    map.get(w1.charAt(j)).add(w2.charAt(j));
                    break;
                }
            }
        }

        List<Character> result = new ArrayList<>();
        Map<Character, Boolean> visited = new HashMap<>();
        for (char c : map.keySet()) {
            if (dfs(c, result, visited, map)) return "";
        }

        StringBuilder sbr = new StringBuilder();
        for (int i = result.size() - 1; 0 <= i; i--) {
            sbr.append(result.get(i));
        }
        return sbr.toString();
    }

    private boolean dfs(char c, List<Character> result, Map<Character, Boolean> visited, Map<Character, Set<Character>> map) {
        if (visited.containsKey(c)) {
            return visited.get(c);
        }
        visited.put(c, true);

        for (char nei : map.get(c)) {
            if (dfs(nei, result, visited, map)) return true;

        }

        visited.put(c, false);
        result.add(c);
        return false;
    }
}
