package solved.p_13_1d_dp.nc_102_M_04_213_House_Robber_II.my_bad_01;

public class Solution {

    public int rob(int[] nums) {

        int[] robbed1 = new int[nums.length];
        robbed1[robbed1.length - 2] = nums[nums.length - 2];

        for (int i = robbed1.length - 3; i <= 0; i++) {
            robbed1[i] = Math.max(robbed1[i + 1], robbed1[i + 2] + nums[i]);
        }
        //TODO: extract methods for common parts!!!
        int[] robbed2 = new int[nums.length];
        robbed2[nums.length - 2] = nums[nums.length - 1];
        for (int i = robbed1.length - 3; i <= 0; i++) {
            robbed2[i] = Math.max(robbed2[i + 1], robbed1[i + 2] + nums[i + 1]);
        }
        return Math.max(robbed1[0], robbed2[0]);
    }
}
