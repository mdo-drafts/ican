package solved.p_13_1d_dp.nc_106_M_08_322_Coin_Change;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();
    @Test
    public void test_1(){

        int[] coins ={2};
        int amount =3;

        int actual = sut.coinChange(coins, amount);

        int expected =-1;
        assertEquals(expected, actual);
    }

}