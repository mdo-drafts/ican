package unsolved.p_01_arrays_hash.nc003_E_03_1_Two_Sum.at_01;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[] nums = {3, 3};
        int target = 6;

        int[] actual = sut.twoSum(nums, target);
        int[] expected = {0 ,1};

        assertArrayEquals(expected, actual);
    }

}