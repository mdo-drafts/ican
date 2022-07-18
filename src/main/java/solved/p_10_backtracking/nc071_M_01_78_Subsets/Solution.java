package solved.p_10_backtracking.nc071_M_01_78_Subsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        dfs(0, nums, subset);
        return result;
    }

    private void dfs(int i, int[] nums, List<Integer> subset) {
        if (nums.length - 1 < i) {
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        dfs(i + 1, nums, subset);
        subset.remove(subset.size() - 1);
        dfs(i + 1, nums, subset);
    }
}
