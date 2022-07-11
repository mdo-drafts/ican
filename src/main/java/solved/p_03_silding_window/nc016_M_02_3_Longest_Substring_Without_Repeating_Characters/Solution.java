package solved.p_03_silding_window.nc016_M_02_3_Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {

        Set<Character> visible = new HashSet<>();

        int l = 0;
        int maxLength = 0;
        for (int r = 0; r < s.length(); r++) {
            if (visible.contains(s.charAt(r))) {
                maxLength = Math.max(maxLength, r - l);
                while (visible.contains(s.charAt(r))) {
                    visible.remove(s.charAt(l));
                    l++;
                }
            }
            visible.add(s.charAt(r));
        }
        return Math.max(maxLength, s.length() - l);
    }
}
