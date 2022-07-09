package solved.p_01_arrays_hash.nc004_M_04_49_Group_Anagrams.at_01;

import org.junit.Test;
import util.ListComparator;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static util.Collections.asList;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> actual = sut.groupAnagrams(strs);

        List<List<String>> expected = asList(
                asList("bat"),
                asList("nat", "tan"),
                asList("ate", "eat", "tea")
        );
        for(List<String> list : actual){
            list.sort(String::compareTo);
        }
        for(List<String> list : expected){
            list.sort(String::compareTo);
        }
        actual.sort(new ListComparator<>());
        expected.sort(new ListComparator<>());

        assertThat(expected).hasSameElementsAs(actual);
    }

}