package solved.p_10_backtracking.nc078_M_08_17_Letter_Combinations_of_a_Phone_Number.nc_01;

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
        combine(0, digits, "");
        return result;
    }

    private void combine(int pointer, String digits, String curr) {
        if (digits.length() - 1 < pointer) {
            result.add(curr);
            return;
        }
        for (char c : map.get(digits.charAt(pointer)).toCharArray()) {
            combine(pointer + 1, digits, curr + c);
        }
    }
}
