package unsolved.p_03_silding_window.nc017_M_03_424_Longest_Repeating_Character_Replacement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        int max = 0;

        for (int r = 0; r < s.length(); r++) {
            map.merge(s.charAt(r), 1, Integer::sum);
            while (k < Collections.min(map.values())) {
                if(k + 1 < map.size()) break;
                max = Math.max(max, r - l);
                map.merge(s.charAt(l), -1, Integer::sum);
                if(map.get(s.charAt(l)) == 0) map.remove(s.charAt(l));
                l++;
            }
        }
        return Math.max(max, s.length() - l);
    }
}
