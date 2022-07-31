package solved.p_12_advanced_graphs.nc093_H_01_332_Reconstruct_Itinerary;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static util.Collections.asList;

public class SolutionTest {
    Solution sut = new Solution();

    @Test
    public void test_1(){
        List<List<String>> tickets = asList(
                asList("MUC","LHR"),
                asList("JFK","MUC"),
                asList("SFO","SJC"),
                asList("LHR","SFO"));

        List<String> actual = sut.findItinerary(tickets);

        List<String> expected = List.of("JFK","MUC","LHR","SFO","SJC");

        assertEquals(expected, actual);
    }

    //{{"JFK","KUL"},{"JFK","NRT"},{"NRT","JFK"}}
    @Test
    public void test_2(){
        List<List<String>> tickets = asList(
                asList("JFK","KUL"),
                asList("JFK","NRT"),
                asList("NRT","JFK"));

        List<String> actual = sut.findItinerary(tickets);

        List<String> expected = List.of("JFK","NRT","JFK","KUL");

        assertEquals(expected, actual);
    }
}