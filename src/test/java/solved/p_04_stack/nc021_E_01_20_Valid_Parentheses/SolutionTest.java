package solved.p_04_stack.nc021_E_01_20_Valid_Parentheses;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_2(){
        assertFalse(sut.isValid("(]"));
    }


    @Test
    public void test_4(){
        assertFalse(sut.isValid("]"));
    }
}