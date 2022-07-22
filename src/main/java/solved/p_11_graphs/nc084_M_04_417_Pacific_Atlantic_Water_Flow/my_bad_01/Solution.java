package solved.p_11_graphs.nc084_M_04_417_Pacific_Atlantic_Water_Flow.my_bad_01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        List<List<Integer>> result = new ArrayList<>();

        Set<List<Integer>> pacificSet = new HashSet<>();

        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[i].length; j++) {
                if (i == 0 || j == 0) {
                    pacificSet.add(List.of(i, j));
                } else if (heights[i - 1][j] <= heights[i][j] && pacificSet.contains(List.of(i - 1, j))) {
                    pacificSet.add(List.of(i, j));
                } else if (heights[i][j - 1] <= heights[i][j] && pacificSet.contains(List.of(i, j - 1))) {
                    pacificSet.add(List.of(i, j));
                }
            }
        }

        Set<List<Integer>> atlanticSet = new HashSet<>();

        for (int i = heights.length - 1; 0 <= i; i--) {
            for (int j = heights[i].length - 1; 0 <= j; j--) {
                if (i == heights.length - 1 || j == heights[i].length - 1) {
                    atlanticSet.add(List.of(i, j));
                } else if (heights[i + 1][j] <= heights[i][j] && atlanticSet.contains(List.of(i + 1, j))) {
                    atlanticSet.add(List.of(i, j));
                } else if (heights[i][j + 1] <= heights[i][j] && atlanticSet.contains(List.of(i, j + 1))) {
                    atlanticSet.add(List.of(i, j));
                }
            }
        }

        for (List<Integer> p : pacificSet) {
            if (atlanticSet.contains(p)) result.add(p);
        }
        return result;
    }
}
