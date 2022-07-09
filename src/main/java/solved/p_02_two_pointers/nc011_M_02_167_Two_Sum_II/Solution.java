package solved.p_02_two_pointers.nc011_M_02_167_Two_Sum_II;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == target) return new int[]{left + 1, right + 1};
            if (nums[left] + nums[right] > target) {
                right--;
                continue;
            }
            left++;
        }
        return new int[0];
    }
}
