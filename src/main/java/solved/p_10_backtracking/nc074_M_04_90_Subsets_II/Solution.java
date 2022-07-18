package solved.p_10_backtracking.nc074_M_04_90_Subsets_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> subSet = new ArrayList<>();
        backtrack(0, nums, subSet);
        return result;
    }

    private void backtrack(int i, int[] nums, List<Integer> subSet) {
        if (nums.length - 1 < i) {
            result.add(new ArrayList<>(subSet));
            return;
        }
        subSet.add(nums[i]);
        backtrack(i + 1, nums, subSet);
        subSet.remove(subSet.size() - 1);

        while (i < nums.length - 1 && nums[i] == nums[i + 1]) i++;
        backtrack(i + 1, nums, subSet);
    }
}
