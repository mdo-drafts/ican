package solved.p_13_1d_dp.nc_104_M_06_647_Palindromic_Substrings;

public class Solution {

    public int countSubstrings(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            int l = i;
            int r = i;
            while (0 <= l && r < s.length() && s.charAt(l) == s.charAt(r)) {
                count++;
                l--;
                r++;
            }

            l = i;
            r = i + 1;
            while (0 <= l && r < s.length() && s.charAt(l) == s.charAt(r)) {
                count++;
                l--;
                r++;
            }
        }
        return count;
    }
}
