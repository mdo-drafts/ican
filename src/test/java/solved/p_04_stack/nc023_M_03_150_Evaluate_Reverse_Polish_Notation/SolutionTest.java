package solved.p_04_stack.nc023_M_03_150_Evaluate_Reverse_Polish_Notation;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        String[] tokens = {"2","1","+","3","*"};

        int actual = sut.evalRPN(tokens);

        int expected = 9;

        assertEquals(expected, actual);

    }

    @Test
    public void test_2(){
        String[] tokens = {"4","3","-"};

        int actual = sut.evalRPN(tokens);

        int expected = 1;

        assertEquals(expected, actual);

    }


    @Test
    public void test_3(){

        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        int actual = sut.evalRPN(tokens);

        int expected = 22;

        assertEquals(expected, actual);
    }

}