package solved.p_11_graphs.nc088_M_09_210_Course_Schedule_II;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int numCourses = 4;

        int[] actual = sut.findOrder(numCourses, prerequisites);

        int[] expected = {0, 2, 1, 3};

        assertArrayEquals(expected, actual);

    }

}