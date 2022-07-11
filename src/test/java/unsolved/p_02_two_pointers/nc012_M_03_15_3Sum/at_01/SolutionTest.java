package unsolved.p_02_two_pointers.nc012_M_03_15_3Sum.at_01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static util.Collections.asList;

public class SolutionTest {

    Solution sut = new Solution();


    @Test
    public void test_1() {

        int[] input = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> actual = sut.threeSum(input);

        List<List<Integer>> expected = asList(
                asList(-1, -1, 2),
                asList(-1, 0, 1)
        );
        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        int[] input = {0};

        List<List<Integer>> actual = sut.threeSum(input);

        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {

        int[] input = {0, 0, 0, 0};

        List<List<Integer>> actual = sut.threeSum(input);

        List<List<Integer>> expected = asList(
                asList(0, 0, 0)
        );
        assertEquals(expected, actual);
    }

    @Test
    public void test_4() {

        int[] input = {-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};

        List<List<Integer>> actual = sut.threeSum(input);

        List<List<Integer>> expected = asList(
                asList(-4, 0, 4),
                asList(-4, 1, 3),
                asList(-3, -1, 4),
                asList(-3, 0, 3),
                asList(-3, 1, 2),
                asList(-2, -1, 3),
                asList(-2, 0, 2),
                asList(-1, -1, 2),
                asList(-1, 0, 1)
        );
        assertEquals(expected, actual);
    }

}