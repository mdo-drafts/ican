package solved.p_13_1d_dp.nc_99_E_01_70_Climbing_Stairs;

public class Solution {

    public int climbStairs(int n) {

        if (n < 3) return n;

        int n1 = 1;
        int n2 = 2;

        for (int i = 3; i <= n; i++) {
            int tmp = n1;
            n1 = n2;
            n2 = n1 + tmp;
        }
        return n2;
    }
}
