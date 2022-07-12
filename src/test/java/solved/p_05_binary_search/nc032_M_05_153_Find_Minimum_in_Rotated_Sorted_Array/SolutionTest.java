package solved.p_05_binary_search.nc032_M_05_153_Find_Minimum_in_Rotated_Sorted_Array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();


    @Test
    public void test_1() {

        int[] nums = {3, 4, 5, 1, 2};
        int actual = sut.findMin(nums);

        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int actual = sut.findMin(nums);

        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {

        int[] nums = {30, 40, 0, 1, 2, 3, 4, 5, 6, 7};
        int actual = sut.findMin(nums);

        int expected = 0;
        assertEquals(expected, actual);
    }

}