package unsolved.p_03_silding_window.nc015_E_01_121_Best_Time_to_Buy_and_Sell_Stock.at_01;

public class Solution {
    public int maxProfit(int[] prices) {

        int max = 0;
        int l = 0;

        for (int r = 0; r < prices.length; r++) {
            if (prices[r] < prices[l]) l = r;
            max = Math.max(max, prices[r] - prices[l]);
        }
        return max;
    }
}
