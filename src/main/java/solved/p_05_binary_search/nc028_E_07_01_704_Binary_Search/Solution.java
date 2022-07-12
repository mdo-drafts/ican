package solved.p_05_binary_search.nc028_E_07_01_704_Binary_Search;

public class Solution {

    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }

    private int binarySearch(int l, int r, int[] nums, int target) {
        if (r < l) return -1;

        //TODO: remember l + (r - l) NOT (l + (r - l))/2
        int mid = l + (r - l) / 2;
        System.out.println(mid);
        if (nums[mid] == target) return mid;

        if (nums[mid] < target) {
            return binarySearch(mid + 1, r, nums, target);
        } else {
            return binarySearch(l, mid - 1, nums, target);
        }
    }
}
