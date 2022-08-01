package solved.p_13_1d_dp.nc_108_M_10_139_Word_Break;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet","code");

        assertTrue(sut.wordBreak(s, wordDict));
    }

    @Test
    public void test_2(){

        String s = "applepenapple";
        List<String> wordDict = Arrays.asList("apple","pen");

        assertTrue(sut.wordBreak(s, wordDict));
    }


    @Test
    public void test_3(){

        String s = "catsandog";
        List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat");

        assertFalse(sut.wordBreak(s, wordDict));
    }

    @Test
    public void test_4(){

        String s = "cars";
        List<String> wordDict = Arrays.asList("car","ca","rs");

        assertTrue(sut.wordBreak(s, wordDict));
    }
}