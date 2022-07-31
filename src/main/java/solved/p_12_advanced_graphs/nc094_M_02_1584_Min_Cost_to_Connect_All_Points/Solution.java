package solved.p_12_advanced_graphs.nc094_M_02_1584_Min_Cost_to_Connect_All_Points;

import java.util.*;

//Time Limit Exceeded
public class Solution {

    public int minCostConnectPoints(int[][] points) {

        List<List<List<Integer>>> adjList = new ArrayList<>();
        for (int i = 0; i < points.length; i++) adjList.add(new ArrayList<>());

        for (int i = 0; i < points.length; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];

            for (int j = 1; j < points.length; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];
                int dist = Math.abs(x1 - x2) + Math.abs(y1 - y2);
                adjList.get(i).add(List.of(dist, j));
                adjList.get(j).add(List.of(dist, i));

            }
        }

        //Prim's algorithm
        int totalCost = 0;
        Set<Integer> visited = new HashSet<>();
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.get(0)));
        pq.add(List.of(0, 0));
        while (visited.size() < points.length) {
            List<Integer> pair = pq.poll();
            int i = pair.get(1);
            if (visited.contains(i)) continue;
            totalCost += pair.get(0);
            visited.add(i);
            for (List<Integer> neighbor : adjList.get(i)) {
                if (!visited.contains(neighbor.get(1))) {
                    pq.add(neighbor);
                }
            }

        }
        return totalCost;
    }

}
