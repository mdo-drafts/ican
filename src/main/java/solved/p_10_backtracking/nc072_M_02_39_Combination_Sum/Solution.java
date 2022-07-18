package solved.p_10_backtracking.nc072_M_02_39_Combination_Sum;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> subSet = new ArrayList<>();
        dfs(target, 0, candidates, subSet);
        return result;
    }

    private void dfs(int remain, int start, int[] candidates, List<Integer> subSet) {
        if (remain == 0) {
            result.add(new ArrayList<>(subSet));
            return;
        }
        if (remain < 0) return;

        for (int i = start; i < candidates.length; i++) {
            subSet.add(candidates[i]);
            dfs(remain - candidates[i], i, candidates, subSet);
            subSet.remove(subSet.size() - 1);
        }
    }
}
