package solved.p_13_1d_dp.nc_105_M_07_91_Decode_Ways;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        int actual = sut.numDecodings("226");
        int expected =3;
        assertEquals(expected, actual);
    }


    @Test
    public void test_2(){

        int actual = sut.numDecodings("106");
        int expected =3;
        assertEquals(expected, actual);
    }
}