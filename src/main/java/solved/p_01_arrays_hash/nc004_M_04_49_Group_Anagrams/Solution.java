package solved.p_01_arrays_hash.nc004_M_04_49_Group_Anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] keyArr = new char[26];
            //TODO: you can't use int[] as a key!!!
            for (char c : s.toCharArray()) keyArr[c -'a']++;
            String key = new String(keyArr);
            map.computeIfAbsent(key,  k -> new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
