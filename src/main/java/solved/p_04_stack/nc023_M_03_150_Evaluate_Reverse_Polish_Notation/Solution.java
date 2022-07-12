package solved.p_04_stack.nc023_M_03_150_Evaluate_Reverse_Polish_Notation;

import java.util.Stack;

public class Solution {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.matches("-?\\d+(\\.\\d+)?")) stack.push(Integer.parseInt(token));
            else {
                int o1 = stack.pop();
                int o2 = stack.pop();
                int res = 0;
                if (token.equals("/")) {
                    res = o2 / o1;
                } else if (token.equals("*")) {
                    res = o2 * o1;
                } else if (token.equals("-")) {
                    res = o2 - o1;
                } else {
                    res = o2 + o1;
                }
                stack.push(res);
            }
        }
        return stack.pop();
    }
}
