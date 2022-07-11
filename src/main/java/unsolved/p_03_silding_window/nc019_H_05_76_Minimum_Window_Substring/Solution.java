package unsolved.p_03_silding_window.nc019_H_05_76_Minimum_Window_Substring;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) tMap.merge(c, 1, Integer::sum);

        Map<Character, Integer> sMap = new HashMap<>();

        int have = 0;
        int need = t.length();

        int l = 0;
        int r = 0;

        String res = "";
        int minLength = Integer.MAX_VALUE;

        while (r < s.length()) {
            char rightChar = s.charAt(r);
            if (tMap.containsKey(rightChar)) {
                sMap.merge(rightChar, 1, Integer::sum);
                if (tMap.get(rightChar) == sMap.get(rightChar)) {
                    have++;
                }
            }
            while (have == need) {
                if (r - l + 1 < minLength) {
                    res = s.substring(l, r + 1);
                    minLength = res.length();
                }
                char leftChar = s.charAt(l);
                if (sMap.containsKey(leftChar)) {
                    sMap.merge(leftChar, -1, Integer::sum);
                    if (sMap.get(leftChar) < tMap.get(leftChar)) {
                        have--;
                    }
                }
                l++;
            }
            r++;
        }
        return res;
    }
}
