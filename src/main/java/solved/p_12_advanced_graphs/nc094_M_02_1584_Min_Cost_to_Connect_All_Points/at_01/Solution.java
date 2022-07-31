package solved.p_12_advanced_graphs.nc094_M_02_1584_Min_Cost_to_Connect_All_Points.at_01;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

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


    public int minCostConnectPoints(int[][] points) {

        PriorityQueue<Pair> heap = new PriorityQueue<>(Comparator.comparingInt(Pair::getWeight));

        Set<Integer> visited = new HashSet<>();

        heap.add(new Pair(0, 0));

        int n = points.length;

        int minCost = 0;

        while (visited.size() < points.length) {
            Pair pair = heap.poll();
            int currNode = pair.getNode();
            int currWeight = pair.getWeight();
            if (visited.contains(currNode)) continue;
            visited.add(currNode);
            minCost += currWeight;
            for (int i = 0; i < points.length; i++) {
                int neiNode = i;
                if (visited.contains(neiNode)) continue;
                int neiNodeWeight = Math.abs(points[currNode][0] - points[neiNode][0]) +
                        Math.abs(points[currNode][1] - points[neiNode][1]);
                heap.add(new Pair(neiNodeWeight, neiNode));
            }
        }
        return minCost;
    }
}
