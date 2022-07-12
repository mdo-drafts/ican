package solved.p_04_stack.nc025_M_05_739_Daily_Temperatures;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        int[] temperatures = {73,74,75,71,69,72,76,73};

        int[] actual = sut.dailyTemperatures(temperatures);

        int[] expected = {1,1,4,2,1,1,0,0};

        assertArrayEquals(expected, actual);

    }

}