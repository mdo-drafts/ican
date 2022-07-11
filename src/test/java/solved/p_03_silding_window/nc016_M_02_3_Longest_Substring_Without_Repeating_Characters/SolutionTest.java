package solved.p_03_silding_window.nc016_M_02_3_Longest_Substring_Without_Repeating_Characters;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        String s = "abcabcbb";

        int actual = sut.lengthOfLongestSubstring(s);

        int expected = 3;

        assertEquals(expected, actual);
    }


    @Test
    public void test_2(){
        String s = "bbbbb";

        int actual = sut.lengthOfLongestSubstring(s);

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3(){
        String s = "pwwkew";

        int actual = sut.lengthOfLongestSubstring(s);

        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void test_4(){
        String s = "aab";

        int actual = sut.lengthOfLongestSubstring(s);

        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void test_5(){
        String s = "dvdf";

        int actual = sut.lengthOfLongestSubstring(s);

        int expected = 3;

        assertEquals(expected, actual);
    }

}