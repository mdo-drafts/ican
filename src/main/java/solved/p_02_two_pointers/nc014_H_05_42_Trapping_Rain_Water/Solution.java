package solved.p_02_two_pointers.nc014_H_05_42_Trapping_Rain_Water;

public class Solution {

    public int trap(int[] height) {

        int result = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < height.length && height[left] == 0) left++;
        while (0 < right && height[right] == 0) right--;

        while (left < right) {
            int leftW = height[left];
            int rightW = height[right];

            if (rightW < leftW) {
                while (height[right] < height[left]) {
                    rightW = Math.max(rightW, height[right]);
                    result += rightW - height[right];
                    right--;
                }
            } else {
                while (height[left] <= height[right] && left < right) {
                    leftW = Math.max(leftW, height[left]);
                    result += leftW - height[left];
                    left++;
                }
            }
        }
        return result;
    }
}
