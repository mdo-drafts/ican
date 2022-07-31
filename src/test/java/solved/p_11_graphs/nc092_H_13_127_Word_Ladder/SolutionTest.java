package solved.p_11_graphs.nc092_H_13_127_Word_Ladder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");

        int actual = sut.ladderLength(beginWord, endWord, wordList);
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        String beginWord = "a";
        String endWord = "c";
        List<String> wordList = new ArrayList<>();
        wordList.add("a");
        wordList.add("b");
        wordList.add("c");

        int actual = sut.ladderLength(beginWord, endWord, wordList);
        int expected = 2;

        assertEquals(expected, actual);
    }

/*
"red"
"tax"
["ted","tex","red","tax","tad","den","rex","pee"]

 */

    @Test
    public void test_3() {

        String beginWord = "red";
        String endWord = "tax";
        List<String> wordList = new ArrayList<>();
        wordList.add("ted");
        wordList.add("tex");
        wordList.add("red");
        wordList.add("tax");
        wordList.add("tad");
        wordList.add("den");
        wordList.add("rex");
        wordList.add("pee");

        int actual = sut.ladderLength(beginWord, endWord, wordList);
        int expected = 4;

        assertEquals(expected, actual);
    }

}