package solved.p_12_advanced_graphs.nc093_H_01_332_Reconstruct_Itinerary;

import java.util.*;

public class Solution {

    LinkedList<String> result = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {

        Map<String, LinkedList<String>> map = new HashMap<>();
        for (List<String> ticket : tickets) {
            map.computeIfAbsent(ticket.get(0), c -> new LinkedList<>());
            map.get(ticket.get(0)).add(ticket.get(1));
        }
        map.forEach((key, value) -> Collections.sort(value));
        dfs("JFK", map);

        return result;
    }

    private void dfs(String origin, Map<String, LinkedList<String>> map) {
        if (map.containsKey(origin)) {
            LinkedList<String> destinations = map.get(origin);
            while (!destinations.isEmpty()) {
                dfs(destinations.pollFirst(), map);
            }
        }
        result.addFirst(origin);
    }
}
