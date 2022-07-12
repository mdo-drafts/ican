package solved.p_04_stack.nc027_H_07_84_Largest_Rectangle_in_Histogram;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int actual = sut.largestRectangleArea(heights);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[] heights = {2, 4};
        int actual = sut.largestRectangleArea(heights);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {
        int[] heights = {2, 1, 2};
        int actual = sut.largestRectangleArea(heights);
        int expected = 3;
        assertEquals(expected, actual);
    }

}