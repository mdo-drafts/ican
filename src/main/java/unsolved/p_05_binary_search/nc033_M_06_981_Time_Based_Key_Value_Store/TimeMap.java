package unsolved.p_05_binary_search.nc033_M_06_981_Time_Based_Key_Value_Store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {

    class Pair {
        String value;
        int timestamp;
        public Pair(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    Map<String, List<Pair>> map = new HashMap<>();

    public TimeMap() {

    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k->new ArrayList<>()).add(new Pair(value, timestamp));
    }

    public String get(String key, int timestamp) {
        String result = "";
        if (!map.containsKey(key)) return result;

        List<Pair> pairs = map.get(key);
        int l = 0;
        //TODO: remember list -> size, array -> length
        int r = pairs.size()-1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (pairs.get(mid).timestamp <= timestamp) {
                result = pairs.get(mid).value;
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }
        return result;
    }
}
