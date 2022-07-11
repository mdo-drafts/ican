package solved.p_03_silding_window.nc018_M_04_567_Permutation_in_String;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean checkInclusion(String s1, String s2) {

        if (s2.length() < s1.length()) return false;

        Map<Character, Integer> s1Map = new HashMap<>();
        for (char c : s1.toCharArray()) s1Map.merge(c, 1, Integer::sum);

        Map<Character, Integer> s2Map = new HashMap<>();
        for (int i = 0; i < s1.length() - 1; i++) {
            if (s1Map.containsKey(s2.charAt(i))) s2Map.merge(s2.charAt(i), 1, Integer::sum);
        }

        int l = 0;
        int r = s1.length() - 1;
        while (r < s2.length()) {
            if (s1Map.containsKey(s2.charAt(r))) s2Map.merge(s2.charAt(r), 1, Integer::sum);
            if (s1Map.equals(s2Map)) return true;
            if (s2Map.containsKey(s2.charAt(l))) s2Map.merge(s2.charAt(l), -1, Integer::sum);
            l++;
            r++;
        }
        return false;
    }
}
