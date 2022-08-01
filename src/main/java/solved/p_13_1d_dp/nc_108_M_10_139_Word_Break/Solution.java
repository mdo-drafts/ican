package solved.p_13_1d_dp.nc_108_M_10_139_Word_Break;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> set = new HashSet<>(wordDict);

        boolean[] dp = new boolean[s.length() + 1];

        dp[0] = true;

        for (int i = 0; i < s.length(); i++) {
            for (String word : wordDict) {
                int j = i + word.length();
                if (j <= s.length() && set.contains(s.substring(i, j)) && dp[i]) {
                    dp[j] = true;
                }
            }
        }
        return dp[s.length()];
    }
}
