package solved.p_12_advanced_graphs.nc_98_M_06_787_Cheapest_Flights_Within_K_Stops;

import java.util.Arrays;

public class Solution {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        int[] prices = new int[n];
        Arrays.fill(prices, Integer.MAX_VALUE);

        prices[src] = 0;

        for (int i = 0; i < k + 1; i++) {
            int[] tmpPrices = Arrays.copyOf(prices, n);

            for (int[] flight : flights) {
                int currSrc = flight[0];
                int currDst = flight[1];
                int currPrice = flight[2];
                if (prices[currSrc] == Integer.MAX_VALUE) continue;

                if (prices[currSrc] + currPrice < tmpPrices[currDst]) {
                    tmpPrices[currDst] = prices[currSrc] + currPrice;
                }
            }
            prices = tmpPrices;
        }
        return prices[dst] == Integer.MAX_VALUE ? -1 : prices[dst];
    }
}
