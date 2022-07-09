package unsolved.p_01_arrays_hash.nc006_M_06_238_Product_of_Array_Except_Self.at_01;
//09.07.2022
public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int r = 1;
        for (int i = nums.length - 1; 0 <= i; i--) {
            result[i] = result[i] * r;
            r *= nums[i];
        }
        return result;
    }
}
