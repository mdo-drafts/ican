package solved.p_10_backtracking.nc078_M_08_17_Letter_Combinations_of_a_Phone_Number.nc_01;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        String digits = "23";

        List<String> actual = sut.letterCombinations(digits);

        List<String> expected = List.of("ad","ae","af","bd","be","bf","cd","ce","cf");

        assertEquals(expected, actual);
    }


    @Test
    public void test_2(){

        String digits = "";

        List<String> actual = sut.letterCombinations(digits);

        List<String> expected = Collections.EMPTY_LIST;

        assertEquals(expected, actual);
    }
}