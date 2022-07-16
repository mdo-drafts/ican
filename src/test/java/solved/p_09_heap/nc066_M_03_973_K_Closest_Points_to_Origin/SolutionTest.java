package solved.p_09_heap.nc066_M_03_973_K_Closest_Points_to_Origin;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[][] points = {{-5, 4}, {-6, -5}, {4, 6}};

        int k = 2;

        int[][] actual = sut.kClosest(points, k);

        int[][] expected = {{-5, 4}, {4, 6}};

        assertArrayEquals(expected, actual);
    }

}