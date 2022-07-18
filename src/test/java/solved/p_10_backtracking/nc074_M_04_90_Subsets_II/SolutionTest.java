package solved.p_10_backtracking.nc074_M_04_90_Subsets_II;

import org.junit.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static util.Collections.asList;

public class SolutionTest {

    Solution sut = new Solution();

    //[[],[0],[0,1],[0,1,4],[0,4],[1],[1,4],[4]]
    @Test
    public void test_1() {

        int[] nums = {4, 1, 0};

        List<List<Integer>> actual = sut.subsetsWithDup(nums);

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

        assertThat(actual).hasSameElementsAs(expected);
    }

}