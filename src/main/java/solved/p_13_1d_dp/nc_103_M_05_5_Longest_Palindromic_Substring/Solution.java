package solved.p_13_1d_dp.nc_103_M_05_5_Longest_Palindromic_Substring;

public class Solution {

    public String longestPalindrome(String s) {

        String res = "";

        for (int i = 0; i < s.length(); i++) {

            int l = i;
            int r = i;
            while (0 <= l && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (res.length() < r - l + 1) res = s.substring(l, r + 1);
                l--;
                r++;
            }

            l = i;
            r = i + 1;
            while (0 <= l && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (res.length() < r - l + 1) res = s.substring(l, r + 1);
                l--;
                r++;
            }
        }
        return res;
    }
}
