package solved.p_12_advanced_graphs.nc096_H_01_778_Swim_in_Rising_Water;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[][] grid = {{0, 1, 2, 3, 4}, {24, 23, 22, 21, 5}, {12, 13, 14, 15, 16}, {11, 17, 18, 19, 20}, {10, 9, 8, 7, 6}};
        int actual = sut.swimInWater(grid);
        int expected = 16;
        assertEquals(expected, actual);
    }

}