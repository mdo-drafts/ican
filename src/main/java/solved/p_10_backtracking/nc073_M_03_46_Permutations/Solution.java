package solved.p_10_backtracking.nc073_M_03_46_Permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> listNums = new ArrayList<>();
        for(int num: nums) listNums.add(num);
        return backtrack(listNums);
    }

    private List<List<Integer>> backtrack(List<Integer> nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.size() == 1) {
            result.add(new ArrayList<>(nums));
            return result;
        }

        for (int i = 0; i < nums.size(); i++) {
            int curr = nums.remove(0);
            List<List<Integer>> backtracked = backtrack(nums);
            for (List<Integer> list : backtracked) {
                list.add(curr);
            }
            result.addAll(backtracked);
            nums.add(curr);
        }
        return result;
    }
}
