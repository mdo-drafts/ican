package solved.p_11_graphs.nc084_M_04_417_Pacific_Atlantic_Water_Flow;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static util.Collections.asList;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[][] heights = {{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};

        List<List<Integer>> actual = sut.pacificAtlantic(heights);

        List<List<Integer>> expected = asList(
                asList(0, 4),
                asList(1, 3),
                asList(1, 4),
                asList(2, 2),
                asList(3, 0),
                asList(3, 1),
                asList(4, 0)
        );
        assertThat(actual).hasSameElementsAs(expected);
    }

}