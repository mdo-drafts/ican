package unsolved.p_03_silding_window
        .nc015_E_01_121_Best_Time_to_Buy_and_Sell_Stock;

public class Solution {

    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        int l = 0;
        int r = 1;
        while (r < prices.length) {
            if (prices[r] < prices[l]) l = r;
            maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
            r++;
        }
        return maxProfit;
    }
}
