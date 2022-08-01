package solved.p_13_1d_dp.nc_110_M_12_416_Partition_Equal_Subset_Sum;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 != 0) return false;

        int targetSum = sum / 2;

        Set<Integer> set = new HashSet<>();
        set.add(0);

        for (int currNum : nums) {
            Set<Integer> tmpSet = new HashSet<>();
            for (int t : set) {
                tmpSet.add(t + currNum);
            }
            set.addAll(tmpSet);
        }
        return set.contains(targetSum);
    }
}
