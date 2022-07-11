package solved.p_02_two_pointers.nc013_M_04_11_Container_With_Most_Water;

public class Solution {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, w * h);
            if (height[left] < height[right]) left++;
            else right--;
        }
        return maxArea;
    }
}
