package solved.p_01_arrays_hash.nc002_E_02_242_Valid_Anagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();

        for (char c : s.toCharArray()) {
            mapS.merge(c, 1, Integer::sum);
        }

        for(char c : t.toCharArray()){
            if(!mapS.containsKey(c)) return false;
            int charCount = mapS.get(c);
            charCount--;
            if(charCount==0) mapS.remove(c);
            else mapS.put(c, charCount);
        }
        return mapS.isEmpty();
    }
}
