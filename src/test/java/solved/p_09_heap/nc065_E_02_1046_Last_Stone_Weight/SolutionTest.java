package solved.p_09_heap.nc065_E_02_1046_Last_Stone_Weight;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut =new Solution();

    @Test
    public void test_1(){

       assertEquals(1, sut.lastStoneWeight(new int[] {2,7,4,1,8,1}));
    }

}