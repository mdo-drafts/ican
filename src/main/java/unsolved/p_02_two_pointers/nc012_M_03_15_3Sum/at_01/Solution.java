package unsolved.p_02_two_pointers.nc012_M_03_15_3Sum.at_01;

import java.util.ArrayList;
import java.util.List;

//BAD
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        int k = 0;
        while (k < nums.length - 2) {
            while (nums[k] == nums[k + 1]) {
                k++;
            }

            int l = k + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[k] + nums[l] + nums[r];
                if (sum > 0) r--;
                else if (sum < 0) l++;
                else {
                    result.add(List.of(nums[k], nums[l], nums[r]));
                    while (nums[l] == nums[l + 1]) {
                        l++;
                    }
                }
            }
            k++;
        }
        return result;
    }
}
