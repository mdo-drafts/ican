package solved.p_04_stack.nc022_M_02_155_Min_Stack;

import java.util.Stack;

public class MinStack {

    Stack<int[]> stack = new Stack<>();

    int min = Integer.MAX_VALUE;

    public MinStack() {

    }

    public void push(int val) {
        if (val < min) {
            min = val;
        }
        stack.push(new int[]{val, min});

    }

    public void pop() {
        int[] removed = stack.pop();
        if (removed[0] == min) {
            if (!stack.isEmpty()) {
                min = stack.peek()[1];
            } else {
                min = Integer.MAX_VALUE;
            }
        }
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }
}
