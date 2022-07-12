package solved.p_04_stack.nc026_M_06_853_Car_Fleet;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int target = 12;
        int[] position = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};

        int actual = sut.carFleet(target, position, speed);

        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        int target = 100;
        int[] position = {0, 2, 4};
        int[] speed = {4, 2, 1};

        int actual = sut.carFleet(target, position, speed);

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {

        int target = 10;
        int[] position = {3};
        int[] speed = {3};

        int actual = sut.carFleet(target, position, speed);

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void test_4() {

        int target = 10;
        int[] position = {6, 8};
        int[] speed = {3, 2};

        int actual = sut.carFleet(target, position, speed);

        int expected = 2;

        assertEquals(expected, actual);
    }


}