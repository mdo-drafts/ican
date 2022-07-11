package unsolved.p_03_silding_window.nc019_H_05_76_Minimum_Window_Substring;

import org.junit.Test;
import unsolved.p_03_silding_window.nc019_H_05_76_Minimum_Window_Substring.Solution;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        String actual = sut.minWindow(s, t);
        String expected = "BANC";
        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        String s = "a";
        String t = "a";

        String actual = sut.minWindow(s, t);
        String expected = "a";
        assertEquals(expected, actual);
    }


}