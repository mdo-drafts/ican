package unsolved.p_09_heap.nc064_E_01_703_Kth_Largest_Element_in_a_Stream;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int num : nums) add(num);
    }

    public int add(int val) {
        heap.add(val);
        if(heap.size() > k){
            heap.poll();
        }
        return heap.peek();
    }
}
