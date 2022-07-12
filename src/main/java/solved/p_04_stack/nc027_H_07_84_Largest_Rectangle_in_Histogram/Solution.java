package solved.p_04_stack.nc027_H_07_84_Largest_Rectangle_in_Histogram;

import java.util.Stack;

public class Solution {

    public int largestRectangleArea(int[] heights) {

        Stack<int[]> stack = new Stack<>();

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            if (stack.isEmpty() || stack.peek()[0] <= heights[i]) {
                stack.push(new int[]{heights[i], i});
            } else {
                int leftIndex = i;
                while (!stack.isEmpty() && heights[i] < stack.peek()[0]) {
                    int[] item = stack.pop();
                    int currArea = item[0] * (i - item[1]);
                    maxArea = Math.max(currArea, maxArea);
                    leftIndex = item[1];
                }
                stack.push(new int[]{heights[i], leftIndex});
            }
        }

        while (!stack.isEmpty()) {
            int[] item = stack.pop();
            int currArea = item[0] * (heights.length - item[1]);
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }

}
