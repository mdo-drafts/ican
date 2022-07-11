package unsolved.p_03_silding_window.nc017_M_03_424_Longest_Repeating_Character_Replacement;

import org.junit.Test;
import unsolved.p_03_silding_window.nc017_M_03_424_Longest_Repeating_Character_Replacement.Solution;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        String s = "AABABBA";
        int k = 1;

        int actual = sut.characterReplacement(s, k);

        int expected = 4;

        assertEquals(expected, actual);

    }

    @Test
    public void test_2() {
        String s = "AABABBBA";
        int k = 1;

        int actual = sut.characterReplacement(s, k);

        int expected = 5;

        assertEquals(expected, actual);

    }

    @Test
    public void test_3() {
        String s = "ABAB";
        int k = 2;

        int actual = sut.characterReplacement(s, k);

        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void test_4() {
        String s = "ABCDE";
        int k = 1;

        int actual = sut.characterReplacement(s, k);

        int expected = 2;

        assertEquals(expected, actual);

    }

    @Test
    public void test_5() {
        String s = "AAAA";
        int k = 2;

        int actual = sut.characterReplacement(s, k);

        int expected = 4;

        assertEquals(expected, actual);
    }

}