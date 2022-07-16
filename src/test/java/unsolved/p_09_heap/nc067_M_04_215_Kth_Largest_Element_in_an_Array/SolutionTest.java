package unsolved.p_09_heap.nc067_M_04_215_Kth_Largest_Element_in_an_Array;

import org.junit.Test;
import unsolved.p_09_heap.nc067_M_04_215_Kth_Largest_Element_in_an_Array.Solution;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        assertEquals(5, sut.findKthLargest(nums, k));
    }

}