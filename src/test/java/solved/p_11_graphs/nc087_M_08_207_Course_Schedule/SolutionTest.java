package solved.p_11_graphs.nc087_M_08_207_Course_Schedule;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    Solution sut = new Solution();


    @Test
    public void test_1() {

        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};

        assertTrue(sut.canFinish(numCourses, prerequisites));
    }

    @Test
    public void test_2() {

        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};

        assertFalse(sut.canFinish(numCourses, prerequisites));
    }

    @Test
    public void test_3() {

        int numCourses = 3;
        int[][] prerequisites = {{1, 0}, {0, 2}};

        assertTrue(sut.canFinish(numCourses, prerequisites));
    }

}