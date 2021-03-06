package unsolved.p_02_two_pointers.nc012_M_03_15_3Sum.at_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//BAD
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int k = 0; k < nums.length - 2; k++) {
            if (k > 0 && nums[k] == nums[k - 1]) continue;

            int l = k + 1;
            int r = nums.length - 1;

            while (l < r) {

                int sum = nums[k] + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    result.add(List.of(nums[k], nums[l], nums[r]));
                    l++;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }

        return result;
    }
}
