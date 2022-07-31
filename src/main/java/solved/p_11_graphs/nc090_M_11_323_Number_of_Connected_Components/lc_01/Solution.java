package solved.p_11_graphs.nc090_M_11_323_Number_of_Connected_Components.lc_01;

import java.util.*;

public class Solution {

    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
            set.add(i);
        }

        for (int[] pair : edges) {
            graph.get(pair[0]).add(pair[1]);
            graph.get(pair[1]).add(pair[0]);
        }

        Queue<Integer> queue = new LinkedList<>();

        int count = 0;
        while(!set.isEmpty()){
            count++;
            queue.add(set.iterator().next());
            while(!queue.isEmpty()){
                int edge = queue.poll();
                if(set.contains(edge)){
                    queue.addAll(graph.get(edge));
                    set.remove(edge);
                }
            }
        }

        return count;
    }
}
