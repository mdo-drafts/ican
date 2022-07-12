package solved.p_05_binary_search.nc029_M_02_74_Search_a_2D_Matrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

        int target = 3;

        assertTrue(sut.searchMatrix(matrix, target));
    }


    @Test
    public void test_2() {

        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

        int target = 13;

        assertFalse(sut.searchMatrix(matrix, target));
    }

    @Test
    public void test_3() {

        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

        int target = 1000;

        assertFalse(sut.searchMatrix(matrix, target));
    }

    @Test
    public void test_4() {

        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

        int target = -1000;

        assertFalse(sut.searchMatrix(matrix, target));
    }

    @Test
    public void test_5() {

        int[][] matrix = {{-60, -34, -30, -23}, {-20, -16, -11, -10}, {-7, -5, -3, -1}};

        int target = -3;

        assertTrue(sut.searchMatrix(matrix, target));
    }

    @Test
    public void test_6() {

        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

        int target = 11;

        assertTrue(sut.searchMatrix(matrix, target));
    }
}