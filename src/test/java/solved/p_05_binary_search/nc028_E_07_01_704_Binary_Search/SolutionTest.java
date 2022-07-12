package solved.p_05_binary_search.nc028_E_07_01_704_Binary_Search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int actual = sut.search(nums, target);

        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 13;

        int actual = sut.search(nums, target);

        int expected = -1;

        assertEquals(expected, actual);
    }
}