package solved.p_04_stack.nc026_M_06_853_Car_Fleet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Solution {

    public int carFleet(int target, int[] position, int[] speed) {

        double[][] posSpeeds = new double[position.length][2];

        for (int i = 0; i < posSpeeds.length; i++) {
            posSpeeds[i] = new double[]{position[i], (target - position[i]) /(double) speed[i]};
        }
        Arrays.sort(posSpeeds, Comparator.comparingDouble(o -> o[0]));

        Stack<double[]> stack = new Stack<>();

        for (double[] posSpeed : posSpeeds) {
            while (!stack.isEmpty() && stack.peek()[1] <= posSpeed[1]) {
                stack.pop();
            }
            stack.push(posSpeed);
        }
        return stack.size();
    }
}
