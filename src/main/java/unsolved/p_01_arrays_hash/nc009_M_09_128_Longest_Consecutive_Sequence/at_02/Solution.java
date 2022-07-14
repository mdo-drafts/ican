package unsolved.p_01_arrays_hash.nc009_M_09_128_Longest_Consecutive_Sequence.at_02;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int max = 0;

        int i = 0;
        while (i < nums.length) {
            if (!set.contains(nums[i] - 1)) {
                int currMax = 0;
                int currNum = nums[i];
                while (set.contains(currNum)) {
                    currMax++;
                    currNum++;
                }
                max = Math.max(currMax, max);
            }
            i++;
        }
        return max;
    }
}
