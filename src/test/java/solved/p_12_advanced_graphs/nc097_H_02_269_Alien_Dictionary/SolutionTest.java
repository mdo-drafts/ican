package solved.p_12_advanced_graphs.nc097_H_02_269_Alien_Dictionary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        String[] words = {"wrt", "wrf", "er", "ett", "rftt"};

        String actual = sut.alienOrder(words);

        String expected = "wertf";

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        String[] words = {"z", "z"};

        String actual = sut.alienOrder(words);

        String expected = "z";

        assertEquals(expected, actual);
    }


}