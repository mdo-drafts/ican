package solved.p_09_heap.nc065_E_02_1046_Last_Stone_Weight;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length < 2) return stones[0];

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) heap.add(stone);

        while (heap.size() > 1) {
            int collRes = heap.poll() - heap.poll();
            if (collRes > 0) heap.add(collRes);
        }
        return heap.isEmpty() ? 0 : heap.peek();
    }
}
