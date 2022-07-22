package solved.p_10_backtracking.nc076_M_06_79_Word_Search;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        char[][] booard =  {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        assertTrue(sut.exist(booard, word));
    }

    @Test
    public void test_2(){
        char[][] booard =  {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        String word = "ABCESEEEFS";
        assertTrue(sut.exist(booard, word));
    }

}