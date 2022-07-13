package unsolved.p_05_binary_search.nc034_M_07_4_Median_of_Two_Sorted_Arrays;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] a = nums1;
        int[] b = nums2;

        if (b.length < a.length) {
            a = nums2;
            b = nums1;
        }

        int total = nums1.length + nums2.length;
        int half = total / 2;

        int l = 0;
        int r = a.length - 1;

        while (true) {

            int i = Math.floorDiv((l + r) , 2);
            int j = half - i - 2;

            int aLeft = i < 0 ? Integer.MIN_VALUE : a[i];
            int aRight = i + 1 < a.length ? a[i + 1] : Integer.MAX_VALUE;

            int bLeft = j < 0 ? Integer.MIN_VALUE : b[j];
            int bRight = j + 1 < b.length ? b[j + 1] : Integer.MAX_VALUE;

            if (aLeft <= bRight && bLeft <= aRight) {
                if (total % 2 == 0) {
                    return (Math.max(aLeft, bLeft) + Math.min(aRight, bRight)) / (double) 2;
                } else {
                    return Math.min(aRight, bRight);
                }
            } else if (aLeft > bRight) {
                r = i - 1;
            } else {
                l = i + 1;
            }
        }
    }
}
