package solved.p_13_1d_dp.nc_101_M_03_198_House_Robber;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        int[] nums = {1,2,3,1};
        int actual = sut.rob(nums);
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2(){

        int[] nums = {2,7,9,3,1};
        int actual = sut.rob(nums);
        int expected = 12;

        assertEquals(expected, actual);
    }

}