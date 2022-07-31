package solved.p_12_advanced_graphs.nc_98_M_06_787_Cheapest_Flights_Within_K_Stops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int n = 4;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int src = 0;
        int dst = 3;
        int k = 1;

        int actual = sut.findCheapestPrice(n, flights, src, dst, k);

        int expected = 700;

        assertEquals(expected, actual);
    }

}