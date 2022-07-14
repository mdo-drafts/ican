package unsolved.p_01_arrays_hash.nc006_M_06_238_Product_of_Array_Except_Self.at_02;

public class Solution {

    public int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];

        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int r = 1;
        for (int i = nums.length - 1; 0 <= i; i--) {
            res[i] = res[i] * r;
            r *= nums[i];

        }
        return res;
    }
}
