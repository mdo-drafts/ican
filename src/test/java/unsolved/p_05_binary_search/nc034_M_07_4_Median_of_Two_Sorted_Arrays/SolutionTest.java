package unsolved.p_05_binary_search.nc034_M_07_4_Median_of_Two_Sorted_Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        System.out.println(Math.floorDiv(-1, 2));

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double actual = sut.findMedianSortedArrays(nums1, nums2);

        double expected = 2;

        assertEquals(expected, actual, 0.1);
    }

}