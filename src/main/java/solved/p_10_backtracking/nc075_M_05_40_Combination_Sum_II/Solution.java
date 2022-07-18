package solved.p_10_backtracking.nc075_M_05_40_Combination_Sum_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    List<List<Integer>> result = new ArrayList<>();


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> subSet = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(target, 0, candidates, subSet);
        return result;
    }


    private void backtrack(int remain, int start, int[] nums, List<Integer> subSet) {
        if (remain == 0) {
            result.add(new ArrayList<>(subSet));
            return;
        }
        if (remain < 0) return;
        int prev = -1;
        for (int i = start; i < nums.length; i++) {
            if (nums[i] == prev) continue;
            subSet.add(nums[i]);
            backtrack(remain - nums[i], i + 1, nums, subSet);
            subSet.remove(subSet.size() - 1);
            prev = nums[i];
        }
    }
}
