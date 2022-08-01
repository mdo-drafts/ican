package solved.p_13_1d_dp.nc_105_M_07_91_Decode_Ways;

public class Solution {


    public int numDecodings(String s) {

        int[] dp = new int[s.length() + 1];

        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i < dp.length; i++) {
            if (s.charAt(i - 1) != '0') dp[i] = dp[i - 1];

            int two = Integer.parseInt(s.substring(i - 2, i));
            if (10 <= two && two <= 26) dp[i] += dp[i - 2];
        }
        return dp[s.length()];
    }
}
