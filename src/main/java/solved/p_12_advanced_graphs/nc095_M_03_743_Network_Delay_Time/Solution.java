package solved.p_12_advanced_graphs.nc095_M_03_743_Network_Delay_Time;

import java.util.*;

public class Solution {

    class Pair {

        int key;

        int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {

        Map<Integer, List<Pair>> map = new HashMap<>();

        for (int[] path : times) {
            map.computeIfAbsent(path[0], c -> new ArrayList<>());
            map.get(path[0]).add(new Pair(path[2], path[1]));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(Pair::getKey));
        Set<Integer> visited = new HashSet<>();

        int time = 0;
        pq.add(new Pair(0, k));
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int currWeight = curr.key;
            int currNode = curr.value;

            if (visited.contains(currNode)) continue;
            time = Math.max(time, currWeight);
            visited.add(currNode);

            if(!map.containsKey(currNode)) continue;

            for (Pair pair : map.get(currNode)) {
                if (!visited.contains(pair.value)) {
                    pq.add(new Pair(pair.key + currWeight, pair.value));
                }
            }
        }
        return visited.size() == n ? time : -1;
    }
}
