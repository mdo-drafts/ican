package solved.p_01_arrays_hash.nc002_E_02_242_Valid_Anagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        String s = "anagram";
        String t = "nagaram";

        assertTrue(sut.isAnagram(s,t));
    }

}