package solved.p_10_backtracking.nc078_M_08_17_Letter_Combinations_of_a_Phone_Number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    Map<Character, String> map = new HashMap<>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        combine(0, digits, new ArrayList<>());
        return result;
    }

    private void combine(int pointer, String digits, List<String> prev) {
        if (digits.length() - 1 < pointer) {
            result.addAll(new ArrayList<>(prev));
            return;
        }

        String currSet = map.get(digits.charAt(pointer));

        if (prev.isEmpty()) prev.add("");

        List<String> currList = new ArrayList<>();

        for (String curr : prev) {
            for (int i = 0; i < currSet.length(); i++) {
                currList.add(curr + currSet.charAt(i));
            }
        }
        combine(pointer + 1, digits, currList);
    }

}
