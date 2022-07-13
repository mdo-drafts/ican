package unsolved.p_03_silding_window.nc015_E_01_121_Best_Time_to_Buy_and_Sell_Stock.at_01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[] prices = {7, 1, 5, 3, 6, 4};
        int actual = sut.maxProfit(prices);
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        int[] prices = {7, 6, 4, 3, 1};
        int actual = sut.maxProfit(prices);
        int expected = 0;

        assertEquals(expected, actual);
    }
}