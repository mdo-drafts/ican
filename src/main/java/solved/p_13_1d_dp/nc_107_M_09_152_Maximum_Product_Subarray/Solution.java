package solved.p_13_1d_dp.nc_107_M_09_152_Maximum_Product_Subarray;

public class Solution {

    public int maxProduct(int[] nums) {

        int max = nums[0];
        int min = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int tmpMax = Math.max(curr, Math.max(curr * max, curr * min));
            min = Math.min(curr, Math.min(curr * max, curr * min));
            max = tmpMax;
            res = Math.max(res, max);
        }

        return res;
    }
}
