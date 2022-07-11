package solved.p_02_two_pointers.nc013_M_04_11_Container_With_Most_Water;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int actual = sut.maxArea(heights);

        int expected = 49;

        assertEquals(expected, actual);

    }

    @Test
    public void test_2() {
        int[] heights = {1, 1};

        int actual = sut.maxArea(heights);

        int expected = 1;

        assertEquals(expected, actual);

    }

}