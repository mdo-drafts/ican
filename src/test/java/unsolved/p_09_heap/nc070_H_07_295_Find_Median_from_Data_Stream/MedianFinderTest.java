package unsolved.p_09_heap.nc070_H_07_295_Find_Median_from_Data_Stream;

import org.junit.Test;
import unsolved.p_09_heap.nc070_H_07_295_Find_Median_from_Data_Stream.MedianFinder;

import static org.junit.Assert.assertEquals;

public class MedianFinderTest {


    @Test
    public void test_1() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);

        assertEquals(1.5, medianFinder.findMedian(), 0.0001);
    }


    @Test
    public void test_2() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(-1);
//        assertEquals(-1, medianFinder.findMedian(), 0.0001);
        medianFinder.addNum(-2);
//        assertEquals(-1.5, medianFinder.findMedian(), 0.0001);
        medianFinder.addNum(-3);
        assertEquals(-2, medianFinder.findMedian(), 0.0001);
    }
}