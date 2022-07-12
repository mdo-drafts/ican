package solved.p_05_binary_search.nc031_M_04_33_Search_in_Rotated_Sorted_Array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int actual = sut.search(nums, target);

        int expected = 4;

        assertEquals(expected, actual);
    }


    @Test
    public void test_2() {

        int[] nums = {1};
        int target = 0;

        int actual = sut.search(nums, target);

        int expected = -1;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {

        int[] nums = {3, 1};
        int target = 1;

        int actual = sut.search(nums, target);

        int expected = 1;

        assertEquals(expected, actual);
    }

}