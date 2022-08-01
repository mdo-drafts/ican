package solved.p_13_1d_dp.nc_109_M_11_300_Longest_Increasing_Subsequence;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

       int[] nums =  {10,9,2,5,3,7,101,18};
       int actual = sut.lengthOfLIS(nums);
       int expected =4;
       assertEquals(expected, actual);

    }

}