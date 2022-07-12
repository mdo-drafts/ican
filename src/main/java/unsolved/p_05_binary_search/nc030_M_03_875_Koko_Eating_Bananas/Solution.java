package unsolved.p_05_binary_search.nc030_M_03_875_Koko_Eating_Bananas;

public class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int l = 1;
        int r = 0;
        for (int i : piles) r = Math.max(r, i);

        int res = r;


        while (l < r) {

            int k = l + (r - l) / 2;
            int hours = 0;
            for (int pile : piles) {
                hours += Math.ceil(pile / (double) k);
            }
            if (hours <= h) {
                r = k - 1;
                res = Math.min(res, k);
            } else {
                l = k + 1;
            }
        }
        return res;
    }
}
