package solved.p_13_1d_dp.nc_104_M_06_647_Palindromic_Substrings.myi_01;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        int actual = sut.countSubstrings("abc");

        int expected = 3;

        assertEquals(expected, actual);
    }


}