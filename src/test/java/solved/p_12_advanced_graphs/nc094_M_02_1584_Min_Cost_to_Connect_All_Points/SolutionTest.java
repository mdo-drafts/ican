package solved.p_12_advanced_graphs.nc094_M_02_1584_Min_Cost_to_Connect_All_Points;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[][] points = {{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};

        int actual = sut.minCostConnectPoints(points);

        int expected = 20;

        assertEquals(expected, actual);
    }

}