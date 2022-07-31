package solved.p_11_graphs.nc089_M_10_684_Redundant_Connection;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[][] edges = {{1, 2}, {1, 3}, {2, 3}};

        int[] actual = sut.findRedundantConnection(edges);

        int[] expected = {2, 3};

        assertArrayEquals(expected, actual);
    }

}