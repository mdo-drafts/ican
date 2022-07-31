package solved.p_11_graphs.nc087_M_08_207_Course_Schedule;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        Map<Integer, Set<Integer>> map = new ConcurrentHashMap<>();

        for (int[] pair : prerequisites) {
            map.computeIfAbsent(pair[0], c -> new HashSet<>());
            map.computeIfAbsent(pair[1], c -> new HashSet<>());
            map.get(pair[0]).add(pair[1]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
            if (entry.getValue().isEmpty()) {
                queue.add(entry.getKey());
                map.remove(entry.getKey());
            }
        }

        while (!queue.isEmpty()){
            int currPre = queue.poll();
            for(Map.Entry<Integer, Set<Integer>> entry : map.entrySet()){
                entry.getValue().remove(currPre);
                if(entry.getValue().isEmpty()) {
                    queue.add(entry.getKey());
                    map.remove(entry.getKey());
                }
            }
        }
        return map.isEmpty();
    }
}
