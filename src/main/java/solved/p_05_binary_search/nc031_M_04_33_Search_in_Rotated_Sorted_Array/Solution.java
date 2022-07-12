package solved.p_05_binary_search.nc031_M_04_33_Search_in_Rotated_Sorted_Array;

public class Solution {

    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }

    private int binarySearch(int l, int r, int[] nums, int target) {
        if (r < l) return -1;

        int mid = l + (r - l) / 2;
        if (nums[mid] == target) return mid;

        //was wrong: if (nums[l] < nums[r])
        if (nums[l] <= nums[mid]) {
            if (nums[mid] < target || target < nums[l]) {
                return binarySearch(mid + 1, r, nums, target);
            } else {
                return binarySearch(l, mid - 1, nums, target);
            }
        } else {
            if (target > nums[r] || target < nums[mid]) {
                return binarySearch(l, mid - 1, nums, target);
            } else {
                return binarySearch(mid + 1, r, nums, target);
            }
        }
    }
}
