package solved.p_13_1d_dp.nc_100_E_02_746_Min_Cost_Climbing_Stairs;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        int[] cost = {10,15,20};
        int actual = sut.minCostClimbingStairs(cost);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void test_2(){

        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int actual = sut.minCostClimbingStairs(cost);
        int expected = 6;
        assertEquals(expected, actual);
    }

}