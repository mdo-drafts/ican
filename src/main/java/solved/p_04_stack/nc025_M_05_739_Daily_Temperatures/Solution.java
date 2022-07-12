package solved.p_04_stack.nc025_M_05_739_Daily_Temperatures;

import java.util.Stack;

public class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] days = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > stack.peek()[0]) {
                int[] item = stack.pop();
                days[item[1]] = i - item[1];
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return days;
    }
}
