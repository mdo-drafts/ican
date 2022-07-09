package solved.p_01_arrays_hash.nc001_E_01_217_Contains_Duplicate;

import java.util.*;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for(int i : nums){
            if(set.contains(i)) return true;
            else set.add(i);
        }
        return false;
    }
}
