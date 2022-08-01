package solved.p_13_1d_dp.nc_101_M_03_198_House_Robber;

public class Solution {

    public int rob(int[] nums) {

        int rob1 = 0;
        int rob2 = 0;

        for (int n : nums) {
            int tmp = Math.max(n + rob1, rob2);
            rob1 = rob2;
            rob2 = tmp;
        }
        return rob2;
    }
}
