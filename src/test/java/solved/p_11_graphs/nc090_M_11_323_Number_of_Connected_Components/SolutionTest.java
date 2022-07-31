package solved.p_11_graphs.nc090_M_11_323_Number_of_Connected_Components;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[][] edges = {{0, 1}, {1, 2}, {3, 4}};
        int n = 5;
        int actual = sut.countComponents(n, edges);
        int expected = 2;

        assertEquals(expected, actual);
    }


    @Test
    public void test_2() {

        int[][] edges = {{2,3},{1,2},{1,3}};
        int n = 4;
        int actual = sut.countComponents(n, edges);
        int expected = 2;

        assertEquals(expected, actual);
    }
}