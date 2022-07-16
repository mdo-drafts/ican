package solved.p_09_heap.nc066_M_03_973_K_Closest_Points_to_Origin;

import java.util.AbstractMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Map.Entry<Integer, int[]>> heap = new PriorityQueue<>(Map.Entry.comparingByKey());
        for (int[] point : points) {
            int key = (int) Math.pow(point[0], 2) + (int) Math.pow(point[1], 2);
            //TODO: you could use an array int[] to keep square of 'point' and its index 'i' from 'points'
            heap.add(new AbstractMap.SimpleEntry<>(key, point));
        }
        int[][] result = new int[k][];
        for(int i=0; i < k; i++){
            result[i] = heap.poll().getValue();
        }
        return result;
    }

}

