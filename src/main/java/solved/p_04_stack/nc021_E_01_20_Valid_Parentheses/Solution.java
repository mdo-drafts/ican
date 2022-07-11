package solved.p_04_stack.nc021_E_01_20_Valid_Parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>() {{
            put('(', ')');
            put('{', '}');
            put('[', ']');
        }};

        Stack<Character> stack = new Stack<>();

        int r = 0;
        while (r < s.length()) {
            Character currChar = s.charAt(r);
            if (map.containsKey(currChar)) {
                stack.push(currChar);
            } else {
                if (stack.isEmpty()) return false;
                if (!currChar.equals(map.get(stack.pop()))) return false;
            }
            r++;
        }
        return stack.isEmpty();
    }
}
