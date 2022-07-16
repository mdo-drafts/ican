package unsolved.p_09_heap.nc070_H_07_295_Find_Median_from_Data_Stream;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {

    PriorityQueue<Integer> lo = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> hi = new PriorityQueue<>();

    public MedianFinder() {

    }

    public void addNum(int num) {
        lo.add(num);
        hi.add(lo.poll());
        if (lo.size() < hi.size()) {
            lo.add(hi.poll());
        }
    }

    public double findMedian() {
        return lo.size() > hi.size() ? lo.peek() : ((double) hi.peek() + lo.peek()) * 0.5;
    }
}
