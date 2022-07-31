package solved.p_11_graphs.nc090_M_11_323_Number_of_Connected_Components;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Solution {

    public int countComponents(int n, int[][] edges) {
        Map<Integer, List<Integer>> map = new ConcurrentHashMap<>();

        for (int[] edge : edges) {
            map.computeIfAbsent(edge[0], c -> new ArrayList<>());
            map.computeIfAbsent(edge[1], c -> new ArrayList<>());
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        int diff = n - map.size();
        int count = 0;
        Set<Integer> visited = new HashSet<>();

        while (!map.isEmpty()) {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(map.entrySet().iterator().next().getKey());
            while (!queue.isEmpty()) {
                int curr = queue.poll();
                if (!visited.contains(curr)) {
                    visited.add(curr);
                    for (int i : map.get(curr)) {
                        queue.add(i);
                    }
                    map.remove(curr);
                }
            }
            count++;
        }
        return count + diff;
    }
}
