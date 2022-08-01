package solved.p_13_1d_dp.nc_102_M_04_213_House_Robber_II;

public class Solution {

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(robMax(nums, 0, nums.length - 2), robMax(nums, 1, nums.length - 1));
    }

    private int robMax(int[] nums, int start, int end) {
        int r1 = 0;
        int r2 = 0;

        for (int i = start; i <= end; i++) {
            int tmp = Math.max(r2, r1 + nums[i]);
            r1 = r2;
            r2 = tmp;
        }
        return r2;
    }
}
