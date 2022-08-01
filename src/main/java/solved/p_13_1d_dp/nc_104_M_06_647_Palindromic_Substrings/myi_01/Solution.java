package solved.p_13_1d_dp.nc_104_M_06_647_Palindromic_Substrings.myi_01;

public class Solution {

    public int countSubstrings(String s) {

        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            res += count(s, i, i);
            res += count(s, i, i+1);
        }
        return res;
    }

    private int count(String s, int l, int r) {
        int count = 0;
        while (0 <= l && r < s.length() && s.charAt(l) == s.charAt(r)) {
            count++;
            l--;
            r++;
        }
        return count;
    }
}
