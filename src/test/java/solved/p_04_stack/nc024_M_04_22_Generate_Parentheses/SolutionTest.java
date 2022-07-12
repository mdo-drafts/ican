package solved.p_04_stack.nc024_M_04_22_Generate_Parentheses;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        List<String> actual = sut.generateParenthesis(3);

        List<String> expected = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");

        assertEquals(expected, actual);
    }

}