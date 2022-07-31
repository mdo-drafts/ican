package solved.p_12_advanced_graphs.nc094_M_02_1584_Min_Cost_to_Connect_All_Points.lc_01;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;


public class Solution {

    class Pair<K, V> {

        K key;

        V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }


    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<Pair<Integer, Integer>> heap = new PriorityQueue<>(Comparator.comparingInt(Pair::getKey));
        heap.add(new Pair<>(0, 0));

        Set<Integer> visited = new HashSet<>();
        int cost = 0;
        while (visited.size() < points.length) {
            Pair<Integer, Integer> curr = heap.poll();
            int currWeight = curr.getKey();
            int currNode = curr.getValue();

            if (visited.contains(currNode)) continue;

            visited.add(currNode);
            cost += currWeight;
            for (int nextNode = 0; nextNode < points.length; nextNode++) {
                if (!visited.contains(nextNode)) {
                    int nextNodeWeight = Math.abs(points[currNode][0] - points[nextNode][0]) + Math.abs(points[currNode][1] - points[nextNode][1]);
                    heap.add(new Pair<>(nextNodeWeight, nextNode));
                }
            }

        }
        return cost;
    }
}
