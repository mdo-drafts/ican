package solved.p_01_arrays_hash.nc004_M_04_49_Group_Anagrams.at_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] keyArr = new char[26];
            for (char c : str.toCharArray()) keyArr[c - 'a']++;
            String key = new String(keyArr);
            map.computeIfAbsent(key, k-> new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
