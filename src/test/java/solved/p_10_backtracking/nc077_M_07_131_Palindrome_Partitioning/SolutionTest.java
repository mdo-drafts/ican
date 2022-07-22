package solved.p_10_backtracking.nc077_M_07_131_Palindrome_Partitioning;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static util.Collections.asList;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        String s = "aab";

        List<List<String>> actual = sut.partition(s);

        List<List<String>> expected = asList(
                asList("a", "a", "b"),
                asList("aa", "b")
        );

        assertThat(actual).hasSameElementsAs(expected);
    }

}