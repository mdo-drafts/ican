package solved.p_12_advanced_graphs.nc095_M_03_743_Network_Delay_Time.at_01;

import java.util.*;

public class Solution {

    class Pair {

        int weight;

        int node;


        public Pair(int weight, int node) {
            this.weight = weight;
            this.node = node;
        }

        public int getWeight() {
            return weight;
        }

        public int getNode() {
            return node;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {

        PriorityQueue<Pair> heap = new PriorityQueue<>(Comparator.comparingInt(Pair::getWeight));

        Map<Integer, List<Pair>> map = new HashMap<>();

        for (int[] time : times) {
            int src = time[0];
            int dst = time[1];
            int weight = time[2];
            map.computeIfAbsent(src, c -> new ArrayList<>());
            map.get(src).add(new Pair(weight, dst));
        }

        heap.add(new Pair(0, k));

        int time = 0;

        Set<Integer> visited = new HashSet<>();

        while (!heap.isEmpty()) {
            Pair curr = heap.poll();
            int currNode = curr.getNode();
            int currWeight = curr.getWeight();
            if (visited.contains(currNode)) continue;
            visited.add(currNode);

            time = Math.max(time, currWeight);

            if(!map.containsKey(currNode)) continue;

            for (Pair nei : map.get(currNode)) {
                if (visited.contains(nei.getNode())) continue;
                heap.add(new Pair(currWeight + nei.getWeight(), nei.getNode()));
            }
        }
        return visited.size() == n ? time : -1;
    }
}
