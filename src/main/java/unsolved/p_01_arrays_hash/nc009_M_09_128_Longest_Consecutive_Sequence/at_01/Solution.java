package unsolved.p_01_arrays_hash.nc009_M_09_128_Longest_Consecutive_Sequence.at_01;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int totalMax = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int curr = num;
                int currMax = 0;
                while (set.contains(curr)) {
                    curr++;
                    currMax++;
                }
                totalMax = Math.max(totalMax, currMax);
            }
        }
        return totalMax;
    }
}
