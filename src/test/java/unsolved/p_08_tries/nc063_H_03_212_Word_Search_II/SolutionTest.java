package unsolved.p_08_tries.nc063_H_03_212_Word_Search_II;

import org.junit.Test;
import unsolved.p_08_tries.nc063_H_03_212_Word_Search_II.Solution;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        char[][] board = {{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};

        String[] words = {"oath"};

        List<String> actual = sut.findWords(board, words);

        List<String> expected = List.of("oath");

        assertEquals(expected, actual);
    }


    @Test
    public void test_2() {
        char[][] board = {{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};

        String[] words = {"oath", "pea", "eat", "rain"};

        List<String> actual = sut.findWords(board, words);

        List<String> expected = List.of("oath", "eat");

        assertEquals(expected, actual);
    }
}