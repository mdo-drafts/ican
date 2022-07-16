package unsolved.p_09_heap.nc067_M_04_215_Kth_Largest_Element_in_an_Array;


public class Solution {

    public int findKthLargest(int[] nums, int k) {
        int kThIndex = nums.length - k;
        return quickSelect(nums, kThIndex, 0, nums.length - 1);
    }

    private int quickSelect(int[] nums, int kThIndex, int l, int r) {
        int pivot = nums[r];
        int p = l;
        for (int i = l; i < r; i++) {
            if (nums[i] <= pivot) {
                int tmp = nums[p];
                nums[p] = nums[i];
                nums[i] = tmp;
                p++;
            }
        }
        int tmp = nums[p];
        nums[p] = nums[r];
        nums[r] = tmp;

        if (kThIndex < p) return quickSelect(nums, kThIndex, l, p - 1);
        if (p < kThIndex) return quickSelect(nums, kThIndex, p + 1, r);
        return nums[p];
    }
}
