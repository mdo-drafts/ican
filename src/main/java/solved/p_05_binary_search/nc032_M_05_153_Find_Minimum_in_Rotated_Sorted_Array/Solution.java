package solved.p_05_binary_search.nc032_M_05_153_Find_Minimum_in_Rotated_Sorted_Array;

public class Solution {

    int min = Integer.MAX_VALUE;

    public int findMin(int[] nums) {
        findMinimum(0, nums.length - 1, nums);
        return min;
    }

    private void findMinimum(int l, int r, int[] nums) {
        if (r < l) return;

        int mid = l + (r - l) / 2;
        if (nums[l] <= nums[mid]) {
            min = Math.min(min, nums[l]);
            findMinimum(mid + 1, r, nums);
        } else {
            min = Math.min(min, nums[mid]);
            findMinimum(l, r - 1, nums);
        }
    }
}
