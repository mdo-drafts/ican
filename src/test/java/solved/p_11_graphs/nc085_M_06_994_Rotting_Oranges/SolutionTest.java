package solved.p_11_graphs.nc085_M_06_994_Rotting_Oranges;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};

        int actual = sut.orangesRotting(grid);

        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2(){

        int[][] grid = {{0,2}};

        int actual = sut.orangesRotting(grid);

        int expected = 0;

        assertEquals(expected, actual);
    }


    @Test
    public void test_3(){

        int[][] grid = {{0,1}};

        int actual = sut.orangesRotting(grid);

        int expected = -1;

        assertEquals(expected, actual);
    }

    @Test
    public void test_4(){

        int[][] grid = {{1},{2},{1},{1}};

        int actual = sut.orangesRotting(grid);

        int expected = 2;

        assertEquals(expected, actual);
    }
}