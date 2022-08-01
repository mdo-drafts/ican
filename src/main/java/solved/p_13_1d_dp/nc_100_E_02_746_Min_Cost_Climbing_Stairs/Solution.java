package solved.p_13_1d_dp.nc_100_E_02_746_Min_Cost_Climbing_Stairs;

public class Solution {

    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 2) return Math.min(cost[0], cost[1]);

        int[] dp = new int[cost.length + 1];

        System.arraycopy(cost, 0, dp, 0, cost.length);

        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i] + Math.min(dp[i - 1], dp[i - 2]);
        }

        return dp[dp.length - 1];
    }
}
