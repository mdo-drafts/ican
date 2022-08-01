package solved.p_13_1d_dp.nc_110_M_12_416_Partition_Equal_Subset_Sum.lc_01;

public class Solution {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 != 0) return false;

        int targetSum = sum / 2;

        boolean[] dp = new boolean[targetSum + 1];
        dp[0] = true;

        for(int currNum : nums){
            for(int j = targetSum; currNum<=j ; j--){
                dp[j] |= dp[j - currNum];
            }
        }
        return dp[targetSum];
    }
}
