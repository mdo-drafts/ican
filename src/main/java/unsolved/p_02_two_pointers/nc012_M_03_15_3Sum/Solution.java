package unsolved.p_02_two_pointers.nc012_M_03_15_3Sum;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        int k = 0;

        while (k < nums.length - 2) {
            int left = k + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[k] + nums[left] + nums[right];
                if (sum > 0) right--;
                else if (sum < 0) left++;
                else {
                    set.add(List.of(nums[k], nums[left], nums[right]));
                    left = k + 1;
                    right--;
                }
            }
            k++;
        }

        return new ArrayList<>(set);
    }
}
