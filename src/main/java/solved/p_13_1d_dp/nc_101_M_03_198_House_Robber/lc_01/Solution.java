package solved.p_13_1d_dp.nc_101_M_03_198_House_Robber.lc_01;

public class Solution {


    public int rob(int[] nums) {

        int[] robbed = new int[nums.length + 1];

        robbed[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; 0 <= i; i--) {
            robbed[i] = Math.max(robbed[i + 1], nums[i] + robbed[i + 2]);
        }
        return robbed[0];
    }

}
