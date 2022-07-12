package solved.p_02_two_pointers.nc014_H_05_42_Trapping_Rain_Water.at_01;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int actual = sut.trap(height);

        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        int[] height = {4, 2, 0, 3, 2, 5};

        int actual = sut.trap(height);

        int expected = 9;

        assertEquals(expected, actual);
    }


}