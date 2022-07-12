package solved.p_04_stack.nc024_M_04_22_Generate_Parentheses;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    List<String> result = new ArrayList<>();

    int n;

    public List<String> generateParenthesis(int n) {
        this.n = n;
        Stack<String> stack = new Stack<>();
        generate(0, 0, stack);
        return result;
    }

    private void generate(int open, int closed, Stack<String> stack) {
        if (stack.size() == n * 2) {
            //TODO: here you can't use stack.pop(), you need the full stack for further generations
            result.add(String.join("", stack));
        }

        if (open < n) {
            stack.push("(");
            generate(open + 1, closed, stack);
            stack.pop();
        }
        if (closed < open) {
            stack.push(")");
            generate(open, closed + 1, stack);
            stack.pop();
        }
    }
}
