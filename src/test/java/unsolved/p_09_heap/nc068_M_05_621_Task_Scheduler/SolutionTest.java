package unsolved.p_09_heap.nc068_M_05_621_Task_Scheduler;

import org.junit.Test;
import unsolved.p_09_heap.nc068_M_05_621_Task_Scheduler.Solution;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        char[] tasks = new char[]{'A','A','A','B','B','B'};

        int n = 2;

        assertEquals(8, sut.leastInterval(tasks, n));

    }

    @Test
    public void test_2() {

        char[] tasks = new char[]{'A','A','A','A','A','A','B','C','D','E','F','G'};

        int n = 2;

        assertEquals(16, sut.leastInterval(tasks, n));

    }

}