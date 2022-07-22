package solved.p_10_backtracking.nc079_H_09_51_N_Queens;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static util.Collections.asList;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        List<List<String>> actual = sut.solveNQueens(4);

        List<List<String>> expected = asList(
                asList(".Q..", "...Q", "Q...", "..Q."),
                asList("..Q.", "Q...", "...Q", ".Q..")
        );
        assertThat(actual).hasSameElementsAs(expected);
    }

}