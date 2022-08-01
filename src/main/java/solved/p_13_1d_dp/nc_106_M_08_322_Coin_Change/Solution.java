package solved.p_13_1d_dp.nc_106_M_08_322_Coin_Change;

import java.util.Arrays;

public class Solution {

    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int a = 1; a < amount + 1; a++) {
            for (int coin : coins) {
                if (0 <= a - coin) dp[a] = Math.min(dp[a], 1 + dp[a - coin]);
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}
