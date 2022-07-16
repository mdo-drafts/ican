package unsolved.p_09_heap.nc068_M_05_621_Task_Scheduler;

import java.util.*;

public class Solution {
    public int leastInterval(char[] tasks, int n) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : tasks) map.merge(c, 1, Integer::sum);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        Queue<int[]> queue = new LinkedList<>();

        for (int value : map.values()) pq.add(value);

        int time = 0;

        while (!pq.isEmpty() || !queue.isEmpty()) {
            time++;
            if (pq.isEmpty()) time = queue.peek()[1];
            else {
                int currTaskCount = pq.poll();
                currTaskCount--;
                if (currTaskCount > 0) queue.add(new int[]{currTaskCount, n + time});
            }
            if (!queue.isEmpty() && queue.peek()[1] == time) pq.add(queue.poll()[0]);
        }
        return time;
    }
}
