package solved.p_12_advanced_graphs.nc095_M_03_743_Network_Delay_Time;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4, k = 2;

        int actual = sut.networkDelayTime(times, n, k);

        int expected = 2;

        assertEquals(expected, actual);

    }

}