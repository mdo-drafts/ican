package solved.p_02_two_pointers.nc014_H_05_42_Trapping_Rain_Water.at_01;

public class Solution {

    public int trap(int[] height) {

        int trapped = 0;

        int l = 0;
        int r = height.length - 1;

        int lMax = height[l];
        int rMax = height[r];

        while (l < r) {

            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, height[l]);
                trapped += lMax - height[l];
            } else {
                r--;
                rMax = Math.max(rMax, height[r]);
                trapped += rMax - height[r];
            }

        }

        return trapped;
    }
}
