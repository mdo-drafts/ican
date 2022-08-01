package solved.p_13_1d_dp.nc_107_M_09_152_Maximum_Product_Subarray;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        int[] nums = {2,3,-2,4};

        int actual = sut.maxProduct(nums);

        int expected = 6;

        assertEquals(expected, actual);
    }

}