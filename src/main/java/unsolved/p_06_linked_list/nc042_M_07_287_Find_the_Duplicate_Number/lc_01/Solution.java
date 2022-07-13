package unsolved.p_06_linked_list.nc042_M_07_287_Find_the_Duplicate_Number.lc_01;

public class Solution {

    public int findDuplicate(int[] nums) {

        int duplicate = -1;
        for (int i = 0; i < nums.length; i++) {
            int cur = Math.abs(nums[i]);
            if (nums[cur] < 0) {
                duplicate = cur;
                break;
            }
            nums[cur] *= -1;
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = Math.abs(nums[i]);
        }
        return duplicate;
    }
}
