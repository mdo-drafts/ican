package unsolved.p_03_silding_window.nc017_M_03_424_Longest_Repeating_Character_Replacement.at_01;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int characterReplacement(String s, int k) {

        Map<Character, Integer> map = new HashMap<>();

        int max = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {

            map.merge(s.charAt(r), 1, Integer::sum);
            while (l < r && r - l + 1 - Collections.max(map.values()) > k) {
                map.merge(s.charAt(l), -1, Integer::sum);
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
