package solved.p_13_1d_dp.nc_110_M_12_416_Partition_Equal_Subset_Sum;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut =new Solution();

    @Test
    public void test_1() {
        int[] nums = {1, 5, 11, 5};
        assertTrue(sut.canPartition(nums));
    }

}