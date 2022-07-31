package solved.p_11_graphs.nc088_M_09_210_Course_Schedule_II;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        int[] inDegree = new int[numCourses];

        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) adjList.add(new ArrayList<>());

        for (int[] pair : prerequisites) {
            adjList.get(pair[1]).add(pair[0]);
            inDegree[pair[0]]++;
        }

        List<Integer> bfs = new ArrayList<>();
        for (int i = 0; i < inDegree.length; i++) if (inDegree[i] == 0) bfs.add(i);

        for (int i = 0; i < bfs.size(); i++) {
            for (int j : adjList.get(bfs.get(i))) {
                if (--inDegree[j] == 0) bfs.add(j);
            }
        }
        return bfs.size() == numCourses ? bfs.stream().mapToInt(i -> i).toArray() : new int[0];
    }

}
