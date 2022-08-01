package solved.p_13_1d_dp.nc_102_M_04_213_House_Robber_II;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        int[] nums ={1,2,3,1};
        int actual = sut.rob(nums);
        int expected =4;
        assertEquals(expected, actual);
    }

}