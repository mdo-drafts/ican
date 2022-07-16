package unsolved.p_09_heap.nc068_M_05_621_Task_Scheduler.my_bad_01;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {

    class Task {

        char task;

        int count;

        int cooldown = 0;

        public Task(char task, int count) {
            this.task = task;
            this.count = count;
        }
    }

    public int leastInterval(char[] tasks, int n) {
        if (n == 0) return tasks.length;

        Map<Character, Integer> tmp = new HashMap<>();
        for (char c : tasks) tmp.merge(c, 1, Integer::sum);

        PriorityQueue<Task> pq = new PriorityQueue<>(new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                int res = Integer.compare(t1.cooldown, t2.cooldown);
                if (res != 0) return res;
                else return Integer.compare(t2.count, t1.count);
            }
        });

        for (Map.Entry<Character, Integer> entry : tmp.entrySet()) pq.add(new Task(entry.getKey(), entry.getValue()));

        int time = 0;
        while (!pq.isEmpty()) {
            if (pq.peek().cooldown == 0) {
                Task task = pq.poll();
                task.count--;
                task.cooldown = n;
                for (Task item : pq) if (item.cooldown > 0) item.cooldown--;
                if (task.count > 0) pq.add(task);
            } else {
                for (Task item : pq) item.cooldown--;
            }
            time++;
        }

        return time;
    }
}
