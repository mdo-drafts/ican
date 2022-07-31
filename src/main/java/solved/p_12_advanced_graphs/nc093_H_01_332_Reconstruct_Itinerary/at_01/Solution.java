package solved.p_12_advanced_graphs.nc093_H_01_332_Reconstruct_Itinerary.at_01;

import java.util.*;

public class Solution {

    public List<String> findItinerary(List<List<String>> tickets) {

        Map<String, TreeSet<String>> map = new HashMap<>();

        for (List<String> pair : tickets) {
            map.computeIfAbsent(pair.get(0), c -> new TreeSet<>());
            map.get(pair.get(0)).add(pair.get(1));
        }

        LinkedList<String> result = new LinkedList<>();

        String origin = "JFK";
        dfs(origin, map, result);

        return result;
    }

    private void dfs(String origin, Map<String, TreeSet<String>> map, LinkedList<String> result) {

        if (map.containsKey(origin)) {
            TreeSet<String> destSet = map.get(origin);
            while (!destSet.isEmpty()) {
                String curr = destSet.first();
                destSet.remove(curr);
                dfs(curr, map, result);
            }
        }
        result.addFirst(origin);
    }

}
