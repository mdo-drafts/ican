package solved.p_11_graphs.nc080_M_01_200_Number_of_Islands;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};

        int actual = sut.numIslands(grid);

        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    public void test_2() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};

        int actual = sut.numIslands(grid);

        int expected = 3;

        assertEquals(expected, actual);

    }


}