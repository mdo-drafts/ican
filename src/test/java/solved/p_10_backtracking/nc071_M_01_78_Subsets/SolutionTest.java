package solved.p_10_backtracking.nc071_M_01_78_Subsets;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static util.Collections.asList;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[] nums = {0, 1, 4};

        List<List<Integer>> actual = sut.subsets(nums);

        List<List<Integer>> expected = asList(
                asList(),
                asList(0),
                asList(0, 1),
                asList(0, 1, 4),
                asList(0, 4),
                asList(1),
                asList(1, 4),
                asList(4)
        );

        assertEquals(expected, actual);
    }

}