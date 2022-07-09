package solved.p_02_two_pointers.nc010_E_01_125_Valid_Palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        assertFalse(sut.isPalindrome("race a car"));
    }

    @Test
    public void test_2(){
        assertFalse(sut.isPalindrome("0P"));
    }

    @Test
    public void test_3(){
        assertTrue(sut.isPalindrome("Aa"));
    }

}