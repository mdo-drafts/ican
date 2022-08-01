package solved.p_13_1d_dp.nc_103_M_05_5_Longest_Palindromic_Substring;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        String actual = sut.longestPalindrome("babad");
        String expected = "bab";
        assertEquals(expected, actual);
    }

}